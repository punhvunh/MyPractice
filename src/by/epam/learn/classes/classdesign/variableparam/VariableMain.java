package by.epam.learn.classes.classdesign.variableparam;

public class VariableMain {
    public static void main(String[] args) {
        VariableParam variableParam = new VariableParam();
        variableParam.method("Hello",50,55,8,-2);
        int [] array = {-5,6,8,25,35};
        variableParam.method("Hello",array);
        VariableParam.method(5,6);
    }
}
