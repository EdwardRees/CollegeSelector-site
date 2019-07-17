import java.util.LinkedHashMap;

public class Main {
        static LinkedHashMap<String, String> q = new LinkedHashMap<>(){
                {
                        // put(question, category)
                        put("How much time is required from students for classwork?", "Academic");
                        put("Are the professors helpful at guiding students?","Academic");
                        put("Does the school feel large? small?","Real Life");
                        put("How is dormatory life like?", "Real Life");
                }
        };

        static FilledJSONFile questions = new FilledJSONFile(q);

        public static void main(String[] args) {
                questions.WriteFile("../public/static/json/", "questions");
        };
}
