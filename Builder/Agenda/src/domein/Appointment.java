package domein;

import java.util.*;

public class Appointment {

    private Collection<Contact> attendees;
    private Location location;
    private java.util.GregorianCalendar startDate;
    private java.util.GregorianCalendar endDate;
    private String description;

    public Collection<Contact> getAttendees() {
        return this.attendees;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public java.util.GregorianCalendar getStartDate() {
        return this.startDate;
    }

    public void setStartDate(java.util.GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public java.util.GregorianCalendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(java.util.GregorianCalendar endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void addAttendee(Contact attendee) {
        attendees.add(attendee);
    }

    public void removeAttendee(Contact attendee) {
        attendees.remove(attendee);
    }

    @Override
    public String toString() {
        return "Appointment{" + "attendees=" + attendees + ", location=" + location + ", startDate=" + startDate + ", endDate=" + endDate + ", description=" + description + '}';
    }

    public void setAttendees(java.util.List<Contact> newAttendees) {
        attendees = newAttendees;
    }
}