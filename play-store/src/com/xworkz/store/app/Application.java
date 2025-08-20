package com.xworkz.store.app;

public class Application {
    private int applicationId;
    private String applicationName;
    private String applicationVersion;
    private String updatedOn;
    private long appDownloads;
    private String applicationSize;
    private String releasedOn;
    private String offeredBy;

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationVersion() {
        return applicationVersion;
    }

    public void setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public long getAppDownloads() {
        return appDownloads;
    }

    public void setAppDownloads(long appDownloads) {
        this.appDownloads = appDownloads;
    }

    public String getApplicationSize() {
        return applicationSize;
    }

    public void setApplicationSize(String applicationSize) {
        this.applicationSize = applicationSize;
    }

    public String getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(String releasedOn) {
        this.releasedOn = releasedOn;
    }

    public String getOfferedBy() {
        return offeredBy;
    }

    public void setOfferedBy(String offeredBy) {
        this.offeredBy = offeredBy;
    }
}
