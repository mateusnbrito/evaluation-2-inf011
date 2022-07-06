package factories;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import types.VideoType;

public class VideoFactory {
  static Map<String, VideoType> videoTypes = new HashMap<>();

  public static VideoType getVideoType(String title, File file){
    VideoType videoType = videoTypes.get(title);

    if(videoType == null){
      videoType = new VideoType(title, file);
      videoTypes.put(title, videoType);
    }

    return videoType;
  }
}
