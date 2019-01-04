package com.exercise4.model;

import java.util.List;

public class Result {
List<MarkSheet> failed;
List<String> names;
MarkSheet studentThree;
public List<MarkSheet> getFailed() {
	return failed;
}
public void setFailed(List<MarkSheet> failed) {
	this.failed = failed;
}
public List<String> getNames() {
	return names;
}
public void setNames(List<String> names) {
	this.names = names;
}
public MarkSheet getStudentThree() {
	return studentThree;
}
public void setStudentThree(MarkSheet studentThree) {
	this.studentThree = studentThree;
}

}
