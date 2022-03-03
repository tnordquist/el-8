package edu.cnm.deepdive.el8.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import java.util.Date;

@Entity(
    tableName = "mood_check_in",
    foreignKeys = @ForeignKey(
        entity = User.class,
        parentColumns = "user_id", childColumns = "user_id",
        onDelete = ForeignKey.CASCADE)
)
public class MoodCheckIn {


  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "mood_check_in_id")
  private long id;

  @NonNull
  private Date created = new Date();

  private int rating;



  @NonNull
  @ColumnInfo(name="progress_report")
  private String progressReport ="";

  @ColumnInfo(name = "user_id",index = true)
  private long userId;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @NonNull
  public Date getCreated() {
    return created;
  }

  public void setCreated(@NonNull Date created) {
    this.created = created;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  @NonNull
  public String getProgressReport() {
    return progressReport;
  }

  public void setProgressReport(@NonNull String progressReport) {
    this.progressReport = progressReport;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }
}