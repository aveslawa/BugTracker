package com.company.entities;

import java.io.Serializable;

/**
 * Created by Viachaslau.
 */
public class Ticket implements Serializable, Comparable {

    private enum TicketCategory {
        Functional, Text, Design, Documentation, Performance, Technical
    }

    private enum TicketIncidentType {
        BUG, IMPROVEMENT
    }

    private enum TicketPriority {
        HIGH, MAJOR, MEDIUM, LOW
    }

    private enum TicketResolution {
        UNRESOLVED, FIXED, NOFIX, DUPLICATE, CANNOTREPRODUCE, VERIFIED
    }

    private enum TicketSeverity {
        CRITICAL, MAJOR, MEDIUM, MINOR
    }

    private enum TicketStatus {
        OPEN, INPROGRESS, RESOLVED, TESTING, REOPENED, CLOSED
    }

    private long id;
    private String title;
    private String description;
    private TicketCategory category;
    private TicketIncidentType incidentType;
    private TicketPriority priority;
    private TicketResolution resolution;
    private TicketSeverity severity;
    private TicketStatus status;

    public Ticket(String title, TicketPriority priority) {
        this.title = title;
        this.priority = priority;
    }

    public Ticket(long id, String title, TicketPriority priority, TicketStatus status) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.status = status;
    }

    public Ticket(long id, String title, TicketCategory category, TicketResolution resolution, TicketStatus status) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.resolution = resolution;
        this.status = status;
    }

    public Ticket(long id, String title, String description, TicketCategory category, TicketIncidentType incidentType, TicketPriority priority, TicketResolution resolution, TicketSeverity severity, TicketStatus status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.incidentType = incidentType;
        this.priority = priority;
        this.resolution = resolution;
        this.severity = severity;
        this.status = status;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TicketCategory getCategory() {
        return category;
    }

    public void setCategory(TicketCategory category) {
        this.category = category;
    }

    public TicketIncidentType getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(TicketIncidentType incidentType) {
        this.incidentType = incidentType;
    }

    public TicketPriority getPriority() {
        return priority;
    }

    public void setPriority(TicketPriority priority) {
        this.priority = priority;
    }

    public TicketResolution getResolution() {
        return resolution;
    }

    public void setResolution(TicketResolution resolution) {
        this.resolution = resolution;
    }

    public TicketSeverity getSeverity() {
        return severity;
    }

    public void setSeverity(TicketSeverity severity) {
        this.severity = severity;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;

        Ticket ticket = (Ticket) o;

        return getId() == ticket.getId();
    }

    @Override
    public int hashCode() {
        return (int) (getId() ^ (getId() >>> 32));
    }

    @Override
    public int compareTo(Object o) {
        Ticket ticket = (Ticket) o;
        if (this.getId() < ticket.getId()) {
            return 1;
        } else if (this.getId() > ticket.getId()) {
            return -1;
        } else return 0;
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", incidentType=" + incidentType +
                ", priority=" + priority +
                ", resolution=" + resolution +
                ", severity=" + severity +
                ", status=" + status +
                '}';
    }
}
