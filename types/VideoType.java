package types;

import java.io.File;

public class VideoType {
  private String title;
  private File file;

  public VideoType(String title, File file) {
    this.title = title;
    this.file = file;
  }

  public void playVideo(Double duration, String type, String category){
    System.out.println(title);
    System.out.println(duration);
    System.out.println(type);
    System.out.println(category);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }
}
