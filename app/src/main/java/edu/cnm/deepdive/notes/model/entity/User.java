package edu.cnm.deepdive.notes.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import java.time.Instant;

@Entity(tableName = "user",
    indices = {
        @Index(value = {"oauth_key"}, unique = true),
        @Index(value = {"display_name"}, unique = true)
    })
public class User {

  /*
  C - Create notes
  R - Retrieve notes and images from self, possibly others shared to user
  U - Update notes, captions, and images
  D - Remove notes, images, and captions (account deletion?)
   */

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "user_id", collate = ColumnInfo.NOCASE)
  private long id;

  @ColumnInfo(name = "oauth_key")
  private String oauthKey;

  @ColumnInfo(name = "display_name", collate = ColumnInfo.NOCASE)
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
