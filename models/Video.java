package models;

import types.VideoType;

public class Video {
  private Double duration;
  private String type;
  private String category;
  private VideoType videoType;

  public Video(Double duration, String type, String category, VideoType videoType) {
    this.duration = duration;
    this.type = type;
    this.category = category;
    this.videoType = videoType;
  }

  public void play(){
    videoType.playVideo(duration, type, category);
  }

  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public VideoType getVideoType() {
    return videoType;
  }

  public void setVideoType(VideoType videoType) {
    this.videoType = videoType;
  }
}
