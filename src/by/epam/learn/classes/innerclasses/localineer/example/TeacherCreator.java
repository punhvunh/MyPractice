package by.epam.learn.classes.innerclasses.localineer.example;

public class TeacherCreator {
    public static AbstractTeacher abstractTeacher(int id){

        class Rector extends AbstractTeacher {

            public Rector(int id) {
                super(id);
            }

            @Override
            public boolean excludeStudent(Student student) {
                if (student != null){
                    return true;
                } else {
                    return false;
                }
            }
        }
        if (isRecordID(id)){
            return new Rector(id);
        } else {
            return new Teacher(id);
        }
    }
    private static boolean isRecordID(int id){
        return (id == 6);
    }
}
