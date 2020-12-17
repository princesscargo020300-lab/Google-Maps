package com.homes;


import android.view.Window;
import android.app.Activity;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.WindowManager;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

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
		
		
		//PRINCESS SARMIENTO CARGO
		LatLng princesscargohome = new LatLng(16.009390, 120.669110);
		LatLng Gate = new LatLng(16.009271,120.668600);
		LatLng NormanosFurniture = new LatLng(16.005182,120.669817);
		LatLng AsinganRd = new LatLng(16.004535,120.668183);
		LatLng AsunganUrdanetaRd1= new LatLng(16.004777,120.668078);
		LatLng MvsGasolineStation= new LatLng(15.991600,120.643183);
		LatLng AsinganDatingDaan= new LatLng(15.987379,120.637427);
		LatLng AsinganUrdanetaRd2= new LatLng(15.981412,120.629142);
		LatLng BactadRd= new LatLng(15.979001,120.621844);
		LatLng PanGasInc= new LatLng(15.977596,120.614579);
		LatLng ChristineBreadHouse= new LatLng(15.976453,120.600155);
		LatLng PerezSt= new LatLng(15.975772,120.566093);
		LatLng BrgySanVicente= new LatLng(15.978863,120.566053);
		LatLng BrgySanVicentecurve= new LatLng(15.978938,120.565414);
		LatLng SevenEleven= new LatLng(15.981796,120.560133);
		LatLng ucu= new LatLng(15.980967,120.560308);
		
		
		
		//UCU CAMPUS
        map.addMarker(new MarkerOptions().position(ucu).
					  title("Urdaneta City University").
					  snippet("15.980967,120.560308"));
        map.moveCamera(CameraUpdateFactory.newLatLng(ucu));


		//CIRCLE URDANETA CITY UNIVERSITY
		map.addCircle(new CircleOptions()
					  .center(new LatLng(15.980967,120.560308))
					  .radius(120)
					  .strokeWidth(7)
					  .strokeColor(Color.BLACK)
					  .fillColor(Color.argb(122, 120, 0, 0)));




//Princess Home
        map.addMarker(new MarkerOptions().position(princesscargohome).
					  title("Princess Cargo Home").
					  snippet("16.009390, 120.669110"));
        map.moveCamera(CameraUpdateFactory.newLatLng(princesscargohome));



//POLYLINE Princess Cargo
		map.addPolyline(new PolylineOptions()
  .add(new LatLng(16.009390, 120.669110),
	new LatLng(16.009271,120.668600),
	new LatLng(16.005182,120.669817),
	new LatLng(16.004535,120.668183),
	new LatLng(16.004777,120.668078),
	new LatLng(15.991600,120.643183),
    new LatLng(15.987379,120.637427),
    new LatLng(15.981412,120.629142),
	new LatLng(15.979001,120.621844),
    new LatLng(15.977596,120.614579),
    new LatLng(15.976453,120.600155),
    new LatLng(15.975772,120.566093),
    new LatLng(15.978863,120.566053),
    new LatLng(15.978938,120.565414),
	new LatLng(15.981796,120.560133),
	new LatLng(15.980967,120.560308))
	.width(7)
   .color(Color.WHITE));
						
						

//CIRCLE PRINCESS CARGO HOME
		map.addCircle(new CircleOptions()
					  .center(new LatLng(16.009390, 120.669110))
					  .radius(120)
					  .strokeWidth(7)
					  .strokeColor(Color.WHITE)
					  .fillColor(Color.argb(122, 120, 0, 0)));
		
					  
					  
					  
					  
					  
					  
					  


		//JICEL MAE ALCANTARA
		LatLng jicelhome = new LatLng(15.9942268 , 120.5854668);
		LatLng AnonasESt = new LatLng(15.993534,120.585449);
		LatLng CayambananRd = new LatLng(15.993380,120.586779);
		LatLng TjvelascoRd = new LatLng(15.987313,120.582016);
		LatLng SanVicenteRd= new LatLng(15.984412,120.580873);
		LatLng SanVicenteRd1= new LatLng(15.982526,120.580108);
		LatLng SanVicenteRd12= new LatLng(15.981930,120.579670);
		LatLng SanVicenteRd13= new LatLng(15.981638,120.579174);
		LatLng Tesda= new LatLng(15.980408,120.575564);
		LatLng Stoplight= new LatLng(15.979244,120.570989);
		LatLng Perez= new LatLng(15.978855,120.566044);
		LatLng JcGasRd= new LatLng(15.978879,120.565596);
		LatLng Ucugate= new LatLng(15.981641,120.560385);
		//URDANETA CITY UNIVERSITY
		LatLng ucucampus= new LatLng(15.980967,120.560308);
		
        //UCU CAMPUS
        map.addMarker(new MarkerOptions().position(ucucampus).
					  title("Urdaneta City University").
					  snippet("15.980967,120.560308"));
        map.moveCamera(CameraUpdateFactory.newLatLng(ucucampus));


		//CIRCLE URDANETA CITY UNIVERSITY
		map.addCircle(new CircleOptions()
					  .center(new LatLng(15.980967,120.560308))
					  .radius(120)
					  .strokeWidth(7)
					  .strokeColor(Color.BLACK)
					  .fillColor(Color.argb(122, 120, 0, 0)));

		
		
        
        
        map.addMarker(new MarkerOptions().position(jicelhome).
					  title("Jicel Mae Alcantara Home").
					  snippet("15.9942268 , 120.5854668"));
        map.moveCamera(CameraUpdateFactory.newLatLng(jicelhome));



		//POLYLINE
		map.addPolyline(new PolylineOptions()
	   .add(new LatLng(15.9942268 , 120.5854668),
	    new LatLng(15.993534,120.585449),
		new LatLng(15.993380,120.586779),
		new LatLng(15.987313,120.582016),
		new LatLng(15.984412,120.580873),
        new LatLng(15.982526,120.580108),
		new LatLng(15.981930,120.579670),
		new LatLng(15.981638,120.579174),
		new LatLng(15.980408,120.575564),
		new LatLng(15.979244,120.570989),
		new LatLng(15.978855,120.566044),
		new LatLng(15.978879,120.565596),
		new LatLng(15.981641,120.560385),
		//URDANETA CITY UNIVERSITY
		new LatLng(15.980967,120.560308))
						.width(7)
						.color(Color.BLUE));

		//CIRCLE JICEL HOME
		map.addCircle(new CircleOptions()
					  .center(new LatLng(15.9942268 , 120.5854668))
					  .radius(120)
					  .strokeWidth(7)
					  .strokeColor(Color.BLUE)
					  .fillColor(Color.argb(122, 120, 0, 0)));
					  
					  
					  
					  
					  
					  
					  
					  
					 				  
					  
	    //LEVI HOME
		LatLng levihome = new LatLng(16.0296699, 120.5077689);
		LatLng Setiobrac = new LatLng(16.027918,120.508121);
		LatLng UrdanetaManaogRoad = new LatLng(16.027207,120.504812);
		LatLng GCEGasolinestation = new LatLng(16.020487,120.507882);
		LatLng SinocalanRiver= new LatLng(15.991154,120.543405);
		LatLng seveneleven= new LatLng(15.981888,120.560115);
		
		LatLng ucu1= new LatLng(15.980967,120.560308);



		//UCU CAMPUS
        map.addMarker(new MarkerOptions().position(ucu1).
					  title("Urdaneta City University").
					  snippet("15.980967,120.560308"));
        map.moveCamera(CameraUpdateFactory.newLatLng(ucu1));


		//CIRCLE URDANETA CITY UNIVERSITY
		map.addCircle(new CircleOptions()
					  .center(new LatLng(15.980967,120.560308))
					  .radius(120)
					  .strokeWidth(7)
					  .strokeColor(Color.BLACK)
					  .fillColor(Color.argb(122, 120, 0, 0)));


	
		
		
		//Levi Home name
		map.addMarker(new MarkerOptions().position(levihome).
					  title("Levi Tulioc Home").
					  snippet("16.0296699, 120.5077689"));
        map.moveCamera(CameraUpdateFactory.newLatLng(levihome));
		
					  
					  
					  
					  
		//POLYLINE LEVI
		map.addPolyline(new PolylineOptions()
		.add(new LatLng(16.0296699, 120.5077689),
		new LatLng(16.027918,120.508121),
		new LatLng(16.027207,120.504812),
		new LatLng(16.020487,120.507882),
		new LatLng(15.991154,120.543405),
		new LatLng(15.981888,120.560115),
		new LatLng(15.980967,120.560308))
		.width(7).
		color(Color.RED));
		
					 
					  
					  
		//CIRCLE LEVI HOME
		map.addCircle(new CircleOptions()
					  .center(new LatLng(16.0296699, 120.5077689))
					  .radius(120)
					  .strokeWidth(7)
					  .strokeColor(Color.RED)
					  .fillColor(Color.argb(122, 120, 0, 0)));
		


		//Zoom In Zoom Out
		map.getUiSettings().setZoomControlsEnabled(true);



//Satelite
		map.setMapType(map.MAP_TYPE_SATELLITE); 


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
