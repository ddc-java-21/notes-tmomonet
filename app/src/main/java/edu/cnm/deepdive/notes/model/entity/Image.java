package edu.cnm.deepdive.notes.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.ColumnInfo.Collate;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.time.Instant;

@Entity(
    tableName = "image",
    foreignKeys = {
        @ForeignKey(
            entity = Note.class,
            parentColumns = "note_id",
            childColumns = "note_id",
            onDelete = ForeignKey.CASCADE
        )
    }
)
public class Image {

  /*
  C - Attach images
  R - Retrieve images from a gallery, possibly filter, or sort?
  U - Update caption
  D - Remove Images?
   */

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "image_id")
  private long id;

  @ColumnInfo(collate = ColumnInfo.NOCASE)
  private String caption;

  @ColumnInfo(name = "mime_type", index = true)
  private String mimeType;

  /** @noinspection NotNullFieldNotInitialized*/
  @NonNull
  private String uri;

  @NonNull
  @ColumnInfo(index = true)
  private Instant created = Instant.now();

  @ColumnInfo(name = "note_id", index = true)
  private long noteId;

  public long getId() {
    return id;
  }

  public Image setId(long id) {
    this.id = id;
    return this;
  }

  public String getCaption() {
    return caption;
  }

  public Image setCaption(String caption) {
    this.caption = caption;
    return this;
  }

  public String getMimeType() {
    return mimeType;
  }

  public Image setMimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  @NonNull
  public String getUri() {
    return uri;
  }

  public Image setUri(@NonNull String uri) {
    this.uri = uri;
    return this;
  }

  @NonNull
  public Instant getCreated() {
    return created;
  }

  public Image setCreated(@NonNull Instant created) {
    this.created = created;
    return this;
  }

  public long getNoteId() {
    return noteId;
  }

  public Image setNoteId(long noteId) {
    this.noteId = noteId;
    return this;
  }
}
