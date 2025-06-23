 
package parts;

import org.eclipse.nebula.widgets.geomap.GeoMap;
import org.eclipse.nebula.widgets.geomap.GeoMapUtil;
import org.eclipse.nebula.widgets.geomap.OsmTileServer;
import org.eclipse.nebula.widgets.geomap.PointD;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.graphics.Point;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;


public class Map {
	@Inject
	public Map() {
		
	}
	
	@PostConstruct
	public void createControls(Composite parent) {
	    parent.setLayout(new FillLayout());

	    GeoMap map = new GeoMap(parent, SWT.NONE);
	    map.setTileServer(OsmTileServer.TILESERVERS[0]);
	    int zoom = 12;
	    map.setZoom(zoom);

	    // run after the UI thread has done initial layout
	    parent.getDisplay().asyncExec(() -> {
	        // compute world‐pixel
	        int x = GeoMapUtil.lon2position(23.60000, zoom);
	        int y = GeoMapUtil.lat2position(46.76667, zoom);
	        // center here
	        map.setCenterPosition(new Point(x, y));
	    });
	}


	
	
	
	
}