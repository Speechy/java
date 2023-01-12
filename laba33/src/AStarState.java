import java.util.HashMap;
import java.util.Set;

/**
 * This class stores the basic state necessary for the A* algorithm to compute a
 * path across a map.  This state includes a collection of "open waypoints" and
 * another collection of "closed waypoints."  In addition, this class provides
 * the basic operations that the A* pathfinding algorithm needs to perform its
 * processing.
 **/
public class AStarState
{
    /** This is a reference to the map that the A* algorithm is navigating. **/
    private Map2D map;

    public HashMap<Location, Waypoint> openWaypoint = new HashMap();
    public HashMap<Location, Waypoint> closeWaypoint = new HashMap();

    /**
     * Initialize a new state object for the A* pathfinding algorithm to use.
     **/
    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");

        this.map = map;
    }

    /** Returns the map that the A* pathfinder is navigating. **/
    public Map2D getMap()
    {
        return map;
    }

    /**
     * This method scans through all open waypoints, and returns the waypoint
     * with the minimum total cost.  If there are no open waypoints, this method
     * returns <code>null</code>.
     **/
    public Waypoint getMinOpenWaypoint()
    {
        Set<Location> allkeys = openWaypoint.keySet();
        float min = Float.MAX_VALUE;
        Waypoint minWP = null;
        for (Location loc:allkeys){
            if (openWaypoint.get(loc).getTotalCost() < min){
                min = openWaypoint.get(loc).getTotalCost();
                minWP = openWaypoint.get(loc);
            }
        }
        return minWP;
    }

    /**
     * This method adds a waypoint to (or potentially updates a waypoint already
     * in) the "open waypoints" collection.  If there is not already an open
     * waypoint at the new waypoint's location then the new waypoint is simply
     * added to the collection.  However, if there is already a waypoint at the
     * new waypoint's location, the new waypoint replaces the old one <em>only
     * if</em> the new waypoint's "previous cost" value is less than the current
     * waypoint's "previous cost" value.
     **/
    public boolean addOpenWaypoint(Waypoint newWP)
    {
        if (!openWaypoint.containsKey(newWP.getLocation())){
            openWaypoint.put(newWP.getLocation(), newWP);
            return true;
        }
        else {
            Waypoint point1 = openWaypoint.get(newWP.getLocation());
            if (point1.getPreviousCost() > newWP.getPreviousCost()) {
                openWaypoint.put(newWP.getLocation(),newWP);
                return true;
            }
        }
        return false;
    }


    /** Returns the current number of open waypoints. **/
    public int numOpenWaypoints()
    {
        return openWaypoint.size();
    }


    /**
     * This method moves the waypoint at the specified location from the
     * open list to the closed list.
     **/
    public void closeWaypoint(Location loc)
    {
        Waypoint wp = openWaypoint.get(loc);
        openWaypoint.remove(loc);
        closeWaypoint.put(loc, wp);
    }

    /**
     * Returns true if the collection of closed waypoints contains a waypoint
     * for the specified location.
     **/
    public boolean isLocationClosed(Location loc)
    {
        return closeWaypoint.containsKey(loc);
    }
}