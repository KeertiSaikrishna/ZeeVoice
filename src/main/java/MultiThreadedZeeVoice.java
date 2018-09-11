import java.io.File;

public class MultiThreadedZeeVoice {
    public static void main(String[] args) {
        File directory = new File("/home/zadmin/IdeaProjects/ZeeVoice/src/main/resources/scriptsRecordings/smallFiles");
        String[] filenames = directory.list();
        for (String str : filenames) {
            SpeechToText thread = new SpeechToText(str);
            thread.start();
        }
    }
}
