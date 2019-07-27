import java.util.LinkedHashMap;


public class Main {
        static LinkedHashMap<String, String> q = new LinkedHashMap<String, String>(){
                {
                        // put(question, category)
                        put("[Category] General Questions", "");
                        put("What are strengths of the University?","General");
                        put("Why did you choose this University", "General");

                        put("[Category] Academic Life Related Questions", "");
                        put("What majors are popular?", "Academic");
                        put("Is having a double major popular among students?", "Academic");
                        put("How much time is required from students for classwork?", "Academic");
                        put("Are the professors helpful at guiding students?","Academic");
                        put("How helpful have your academic advisors been?", "Academic");
                        put("How popular is studying abroad?", "Academic");
                        put("How accessible are professors when you need help?", "Academic");
                        put("How flexible is the course registration process?", "Academic");
                        put("What are the acceptance rates in ____ major? (Insert the major you're looking at)", "Academic");
                        
                        put("[Category] Real Life Related Questions", "");
                        put("Does the school feel large? small?","Real Life");
                        put("How is dormatory life like?", "Real Life");
                        put("What kinds of clubs are there here?", "Real Life");
                        put("How was the transition to University life in your first year?", "Real Life");
                        put("What is the social scene around the University like?", "Real Life");
                        put("How difficult is it to find housing here? What services does the University provide in the housing search?", "Real Life");
                        put("Do you feel safe on campus? What is campus security like?", "Real Life");
                        put("What is the food on campus like?", "Real Life");
                        put("What are the local off campus fod options like?", "Real Life");
                        put("Does the University provide access to public transportation?", "Real Life");
                        put("Does the University provide parking for students?", "Real Life");
                        put("What amenities are provided by the University by living in dormitories?", "Real Life");
                        put("What services/amenities are provided by the University for students?", "Real Life");
                        

                        put("[Category] Career Related Questions", "");
                        put("How simple/complicated is the process to get an internship here?", "Career");
                        put("Are internships popular here?", "Career");

                }
        };

        public static FilledJSONFile questions = new FilledJSONFile(q);

        public static void main(String[] args) {
                questions.WriteFile("../public/static/json/", "questions");
        };
}
