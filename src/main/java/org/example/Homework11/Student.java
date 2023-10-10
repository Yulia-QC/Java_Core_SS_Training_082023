package org.example.Homework11;

public class Student {
    private String name;
    private int score;
    private String[] files;

    public Student(String name, String[] files) {
        this.name = name;
        this.files = files;
        this.score = 0;
    }

    public void calculateScore() {
        for(String file : files) {
            try {
                int fileScore = checkFileExtention(file);
                score += fileScore;
            } catch (InvalidFileNameException e) {
                System.out.println("Error for student " + name + ": " + e.getMessage());
            }
        }
    }
    public int getScore() {
        return score;
    }
    public String getName() {
        return name;
    }

    public int checkFileExtention(String fileName) throws InvalidFileNameException {
        if(fileName == null || fileName.isEmpty()) {
            throw  new InvalidFileNameException("File name is null or emty");
        }
        if(fileName.endsWith(".java")) {
            return 1;
        }else {
            return 0;
        }
    }
}
