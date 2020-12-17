package com.shslocation;


import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends Activity implements OnMapReadyCallback, LocationListener {
    GoogleMap map;
    LocationManager locationManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);

	}

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;


		//SHS PRINCESS CARGO
		LatLng cargo = new LatLng(16.004885126, 120.66634591);
        map.addMarker(new MarkerOptions().position(cargo).
					  title("Luciano Millan National High School").
					  snippet("Princess Sarmiento Cargo School"));
        map.moveCamera(CameraUpdateFactory.newLatLng(cargo));
		
		

		//SHS JICEL MAE ALCANTARA
		LatLng alcantara = new LatLng(16.04716, 120.5954392);
        map.addMarker(new MarkerOptions().position(alcantara).
					  title("Zamora St. Poblacion Binalonan, Pangasinan").
					  snippet("16.04716, 120.5954392").
					  snippet("Jicel Mae Alcantara School"));
        map.moveCamera(CameraUpdateFactory.newLatLng(alcantara));

		

		// SHS LEVI TULIOC
		LatLng tulioc = new LatLng(16.046603064, 120.487238216);
        map.addMarker(new MarkerOptions().position(tulioc).
					  title("Manaoag National High School").
					  snippet("Levi Tulioc School"));
        map.moveCamera(CameraUpdateFactory.newLatLng(tulioc));



		//Zoom In Zoom Out
		map.getUiSettings().setZoomControlsEnabled(true);



    }

    @Override
    public void onLocationChanged(Location location) {
        map.clear();
        LatLng currentLocation = new LatLng(location.getLatitude(), location.getLongitude());


        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(currentLocation);
        map.addMarker(markerOptions);

        map.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 170.0f));
    }


    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}



