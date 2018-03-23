
package de.ctsc.debitoor.java.api.v4;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A file attachment. For expenses these properties will be set if you save the expense with an fileId
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "url",
    "fileName",
    "lastModified",
    "type",
    "sizeBytes",
    "thumbnailsUrl"
})
public class File {

    /**
     * id of the file attachment
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("id of the file attachment")
    private String id;
    /**
     * link to the file attachment
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("link to the file attachment")
    private String url;
    /**
     * Name of original file
     * 
     */
    @JsonProperty("fileName")
    @JsonPropertyDescription("Name of original file")
    private String fileName;
    /**
     * When was file last modified
     * 
     */
    @JsonProperty("lastModified")
    @JsonPropertyDescription("When was file last modified")
    private String lastModified;
    /**
     * MIME type of the file attachment
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("MIME type of the file attachment")
    private String type;
    /**
     * Size of the file attachment in bytes
     * 
     */
    @JsonProperty("sizeBytes")
    @JsonPropertyDescription("Size of the file attachment in bytes")
    private Double sizeBytes;
    /**
     * You can get the thumbnails for a pdf by GET-ting this url
     * 
     */
    @JsonProperty("thumbnailsUrl")
    @JsonPropertyDescription("You can get the thumbnails for a pdf by GET-ting this url")
    private String thumbnailsUrl;

    /**
     * id of the file attachment
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * id of the file attachment
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public File withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * link to the file attachment
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * link to the file attachment
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public File withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Name of original file
     * 
     */
    @JsonProperty("fileName")
    public String getFileName() {
        return fileName;
    }

    /**
     * Name of original file
     * 
     */
    @JsonProperty("fileName")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public File withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * When was file last modified
     * 
     */
    @JsonProperty("lastModified")
    public String getLastModified() {
        return lastModified;
    }

    /**
     * When was file last modified
     * 
     */
    @JsonProperty("lastModified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public File withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * MIME type of the file attachment
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * MIME type of the file attachment
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public File withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Size of the file attachment in bytes
     * 
     */
    @JsonProperty("sizeBytes")
    public Double getSizeBytes() {
        return sizeBytes;
    }

    /**
     * Size of the file attachment in bytes
     * 
     */
    @JsonProperty("sizeBytes")
    public void setSizeBytes(Double sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    public File withSizeBytes(Double sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }

    /**
     * You can get the thumbnails for a pdf by GET-ting this url
     * 
     */
    @JsonProperty("thumbnailsUrl")
    public String getThumbnailsUrl() {
        return thumbnailsUrl;
    }

    /**
     * You can get the thumbnails for a pdf by GET-ting this url
     * 
     */
    @JsonProperty("thumbnailsUrl")
    public void setThumbnailsUrl(String thumbnailsUrl) {
        this.thumbnailsUrl = thumbnailsUrl;
    }

    public File withThumbnailsUrl(String thumbnailsUrl) {
        this.thumbnailsUrl = thumbnailsUrl;
        return this;
    }

}
