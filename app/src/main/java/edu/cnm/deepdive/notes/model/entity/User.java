package edu.cnm.deepdive.notes.model.entity;

import java.time.Instant;

public class User {

  /*
  C - Create notes
  R - Retrieve notes and images from self, possibly others shared to user
  U - Update notes, captions, and images
  D - Remove notes, images, and captions (account deletion?)
   */

  private long id;
  private String oauthKey;
  private String displayName;
  private Instant created;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getOauthKey() {
    return oauthKey;
  }

  public void setOauthKey(String oauthKey) {
    this.oauthKey = oauthKey;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Instant getCreated() {
    return created;
  }

  public void setCreated(Instant created) {
    this.created = created;
  }

}
