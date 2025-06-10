package edu.cnm.deepdive.notes.model.entity;

import java.time.Instant;

public class Image {

  /*
  C - Attach Images to a note
  R - Retrieve all images for a note
  U - Update caption
  D - Remove Image from a note
   */

  private long id;
  private String caption;
  private String mimeType;
  private String uri;
  private Instant created;
  private long noteId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Instant getCreated() {
    return created;
  }

  public void setCreated(Instant created) {
    this.created = created;
  }

  public long getNoteId() {
    return noteId;
  }

  public void setNoteId(long noteId) {
    this.noteId = noteId;
  }
}
