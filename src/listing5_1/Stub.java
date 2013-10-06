package listing5_1;

public @interface Stub
{
	int id();
	String dueDate();
	String developer() default "unassigned";
}
