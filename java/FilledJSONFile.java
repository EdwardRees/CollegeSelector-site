import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class FilledJSONFile {
    // Singles and Duos covered, more complex leave to BASIC and fill in later
    private int version = 0;
    private List<String> questions;
    private Map<String, String> mappedQuestions;

    public FilledJSONFile(Map<String, String> questions) {
        this.mappedQuestions = questions;
        this.version = 2;
    }

    public FilledJSONFile(List<String> questions) {
        this.questions = questions;
        this.version = 1;
    }

    // public FilledJSONFile(Map<String, ArrayList<ArrayList<String>>> versions) {
    // ArrayList<String> versionNumber = new ArrayList<String>();
    // ArrayList<String> description = new ArrayList<String>();
    // ArrayList<String> date = new ArrayList<String>();
    // for (String key : versions.keySet()) {
    // versionNumber.add(key);
    // }
    // this.version = 2;
    // // for ()
    // // ArrayList<String> versionNumber = new ArrayList<String>();
    // // ArrayList<String> text = new ArrayList<String>();
    // // ArrayList<String> date = new ArrayList<String>();
    // // for (String key : quotes.keySet()) {
    // // versionNumber.add(key);
    // // }
    // // for (String value : quotes.values()) {
    // // values.add(value);
    // // }
    // // this.names = names;
    // // this.values = new ArrayList<ArrayList<String>>() {
    // // {
    // // add(values);
    // // }
    // // };
    // // this.category = new ArrayList<String>() {
    // // {
    // // add("version");
    // // }
    // // };
    // // this.version = 3;
    // }

    // public FilledJSONFile(Map<String, String> versions) {
    // ArrayList<String> versionNumber = new ArrayList<String>();
    // ArrayList<String> text = new ArrayList<String>();
    // ArrayList<String> date = new ArrayList<String>();
    // for (String key : quotes.keySet()) {
    // versionNumber.add(key);
    // }
    // for (String value : quotes.values()) {
    // values.add(value);
    // }
    // this.names = names;
    // this.values = new ArrayList<ArrayList<String>>() {
    // {
    // add(values);
    // }
    // };
    // this.category = new ArrayList<String>() {
    // {
    // add("version");
    // }
    // };
    // this.version = 3;
    // }

    public FilledJSONFile() {

    }

    private ArrayList<String> getQuestions() {
        return this.questions;
    }

    private Map<String, String> getMappedQuestions() {
        return this.mappedQuestions;
    }

    public String create() {
        String setup = "[\n";
        String f = setup;
        switch (version) {
        case 1:
            for (int i = 0; i < this.getQuestions().size(); i++) {
                f += "  {\n    \"id\": " + i + ",\n    \"question\": \"" + this.getQuestions().get(i) + "\",\n";
                f = f.substring(0, f.length() - 2);
                f += "\n  },\n";
            }
            f = f.substring(0, f.length() - 2);
            f += "\n]";
            break;

        case 2:
            for (int i = 0; i < this.getMappedQuestions().size(); i++) {
                String key = this.getMappedQuestions().keySet().toArray(new String[0])[i];
                String value = this.getMappedQuestions().get(key);
                f += "  {\n    \"id\": " + i + ",\n    \"category\": \"" + value + "\",\n    \"question\": \"" + key
                        + "\",\n";
                f = f.substring(0, f.length() - 2);
                f += "\n  },\n";
            }
            f = f.substring(0, f.length() - 2);
            f += "\n]";
            break;

        // for (int i = 0; i < this.getNames().size(); i++) {
        // f += " {\n \"id\": " + i + ",\n \"name\": \"" + this.getNames().get(i) +
        // "\",\n";
        // for (int j = 0; j < this.category.size(); j++) {
        // f += " \"" + this.category.get(j) + "\": \"" + this.values.get(j).get(i) +
        // "\",\n";
        // }
        // f = f.substring(0, f.length() - 2);
        // f += "\n },\n";
        // }
        // f = f.substring(0, f.length() - 2);
        // f += "\n]";
        // break;

        }
        return f;
    }

    public void printJSON() {
        System.out.println(create());
    }

    public void WriteFile(String path, String title) {
        File defaultDir = new File("/Users/edwardrees/Projects/Generated/JSON");
        File dir = new File(path);
        if (path == "" || path == null) {
            dir = defaultDir;
        }
        File file = new File(dir, title + ".json");
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
            writer.write(create());
        } catch (IOException e) {
            e.printStackTrace(); // I'd rather declare method with throws IOException and omit this catch.
        } finally {
            if (writer != null)
                try {
                    writer.close();
                } catch (IOException ignore) {
                }
        }
        System.out.printf("File is located at %s%n", file.getAbsolutePath());
    }

    public void WriteFile(String title) {
        File defaultDir = new File("/Users/edwardrees/Projects/Generated/JSON");

        File file = new File(defaultDir, title + ".json");
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
            writer.write(create());
        } catch (IOException e) {
            e.printStackTrace(); // I'd rather declare method with throws IOException and omit this catch.
        } finally {
            if (writer != null)
                try {
                    writer.close();
                } catch (IOException ignore) {
                }
        }
        System.out.printf("File is located at %s%n", file.getAbsolutePath());
    }

    // public static void main(String[] args) {
    // ArrayList<String> names = new ArrayList<String>() {
    // {
    // add("user1");
    // add("user2");
    // add("user3");
    // }
    // };
    // String c1a = "cat1a";
    // String c2a = "cat2a";
    // ArrayList<String> c1 = new ArrayList<String>() {
    // {
    // add("cat1a");

    // }
    // };
    // ArrayList<String> c2 = new ArrayList<String>() {
    // {
    // add("cat2a");
    // }
    // };
    // ArrayList<String> v1 = new ArrayList<String>() {
    // {
    // add("val1a");
    // add("val1b");
    // add("val1c");
    // }
    // };
    // ArrayList<String> v2 = new ArrayList<String>() {
    // {
    // add("val2a");
    // add("val2b");
    // add("val2c");
    // }
    // };
    // ArrayList<String> c = new ArrayList<String>() {
    // {
    // add("cat1");
    // add("cat2");
    // }
    // };
    // ArrayList<ArrayList<String>> v = new ArrayList<ArrayList<String>>() {
    // {
    // add(new ArrayList<String>() {
    // {
    // add("cat1Value1");
    // add("cat1Value2");
    // add("cat1Value3");
    // }
    // });
    // add(new ArrayList<String>() {
    // {
    // add("cat2Value1");
    // add("cat2Value2");
    // add("cat2Value3");
    // }
    // });
    // }
    // };
    // // FilledJSONFile f = new FilledJSONFile(names, "Cat1", v1, "Cat2", v2);
    // // FilledJSONFile f = new FilledJSONFile(names, c1, v1, c2, v2);
    // FilledJSONFile f = new FilledJSONFile(names, c, v);
    // // System.out.println(f.create());
    // String[] questions = { "school_ranking", "program_match",
    // "department_ranking", "school_selectivity",
    // "admissions_percentage", "teaching_calendar", "student_faculty_ratio",
    // "average_class_size",
    // "freshmen_retention_rate", "four_year_graduation_rate",
    // "course_selection_flexibility",
    // "mandatory_course_req", "second_language_req", "teaching_week",
    // "student_academic_services",
    // "internship_coop_programs", "international_study_abroad_programs",
    // "learning_through_service",
    // "school_size", "school_setting", "student_body_mix", "student_diversity",
    // "fraternity_sorority_opportunities", "student_social_centers", "dorm_rooms",
    // "dorm_life",
    // "campus_facilities", "cafeteria_food_options", "local_off_campus_food",
    // "local_entertainment_options",
    // "school_sports_events", "school_clubs", "on_campus_security_provisions",
    // "local_on_campus_transportation", "student_car_policy_parking",
    // "friends_attending_nearby",
    // "family_support_availability", "school_medical_insurance",
    // "travel_convenience", "work_opportunities",
    // "international_student_connection" };

    // ArrayList<String> questionsList = new ArrayList<String>();
    // QuestionsArrayList q = new QuestionsArrayList();
    // questionsList = q.ConvertedQuestions();

    // ArrayList<String> categories = new ArrayList<String>() {
    // {
    // add("description");
    // }
    // };
    // ArrayList<ArrayList<String>> values = new ArrayList<ArrayList<String>>() {
    // {
    // add(q.ConvertedDescription());
    // }
    // };
    // FilledJSONFile qf = new FilledJSONFile(questionsList, categories, values);
    // System.out.println(qf.create());

    // }

}
