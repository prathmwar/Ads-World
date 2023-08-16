import java.util.LinkedList;
public class TrainRoute
{
    private int routeId;
    private Station sourceStation;
    private Station destinationStation;
    private LinkedList<Station> stations;
    public TrainRoute(int routeId, Station sourceStation, Station destinationStation)

    {
        this.routeId = routeId;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.stations = new LinkedList<>();
    }
    public int getRouteId() {
        return routeId;
    }
    public Station getSourceStation() {
        return sourceStation;
    }
    public Station getDestinationStation() {
        return destinationStation;
    }
    public LinkedList<Station> getStations() {
        return stations;
    }
    public void addStation(Station station, int position) {
        if (position < 0 || position > stations.size()) {
            throw new IllegalArgumentException("Invalid position");
        }
        Station prevStation = null;
        Station nextStation = null;
        if (position == 0) {
            prevStation = null;
            nextStation = stations.get(0);
        } else if (position == stations.size()) {
            prevStation = stations.get(stations.size() - 1);
            nextStation = null;
        } else {
            prevStation = stations.get(position - 1);
            nextStation = stations.get(position + 1);
        }
        station.setNextStation(nextStation);
        station.setPreviousStation(prevStation);
        if (prevStation != null) {
            prevStation.setNextStation(station);
        }
        if (nextStation != null) {
            nextStation.setPreviousStation(station);
        }
        stations.add(position, station);
    }
    public void removeStation(int stationId) {
        Station station = findStation(stationId);
        if (station == null) {
            throw new IllegalArgumentException("Station not found");
        }
        Station prevStation = station.getPreviousStation();
        Station nextStation = station.getNextStation();
        if (prevStation != null) {
            prevStation.setNextStation(nextStation);
        }
        if (nextStation != null) {
            nextStation.setPreviousStation(prevStation);
        }
        stations.remove(station);
    }
    public Station findStation(int stationId) {
        for (Station station : stations) {
            if (station.getStationId() == stationId) {
                return station;
            }
        }
        return null;
    }
    public void moveTrain(Train train) {
        Station currentStation = train.getCurrentStation();
        Station nextStation = currentStation.getNextStation();
        if (nextStation == null) {
            throw new IllegalStateException("Train has reached the destination station");
        }
        train.setCurrentStation(nextStation);
    }
    public void updateRoute(int routeId, LinkedList<Integer> stationIds) {
        if (routeId != this.routeId) {
            throw new IllegalArgumentException("Invalid route ID");
        }
        for (int stationId : stationIds) {
            Station station = findStation(stationId);
            if (station == null) {
                throw new IllegalArgumentException("Station not found");
            }
            addStation(station, stations.size());
        }
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Route ID: ").append(routeId).append("\n");
        sb.append("Source Station: ").append(sourceStation.getStationName()).append("\n");
        sb.append("Destination Station: ").append(destinationStation.getStationName()).append("\n");
        sb.append("Stations: ");
        for (Station station : stations) {
            sb.append(station.getStationName()).append(", ");
        }
        return sb.toString();

        }
    public void updateRoute(int routeId, LinkedList<Integer> stationIds)
    {
        if (routeId != this.routeId) {
            throw new IllegalArgumentException("Invalid route ID");
        }
        for (int stationId : stationIds) {
            Station station = findStation(stationId);
            if (station == null) {
                throw new IllegalArgumentException("Station not found");
            }
            addStation(station, stations.size());
        }
    }
    }
}
