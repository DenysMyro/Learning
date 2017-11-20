package ua.edu.sumdu.j2se.MyroshnychenkoDenys.tasks;

import java.util.Arrays;

public class ArrayTaskList {

    private Task[] tasklist = new Task [1];
    int listHead = 0;

    public void add(Task task) {
        if(listHead>=tasklist.length) {
            Task tempList [] = new Task[tasklist.length+1];
            for(int i=0;i<tasklist.length;i++){
                tempList [i] = tasklist [i];
            }
            tasklist = tempList;
        }
        tasklist [listHead] = task;
        listHead++;
    }

    public boolean remove (Task task) {
        for(int i=0; i<tasklist.length;i++){
            if (task.equals(tasklist[i])){
                tasklist[i] = null;
                return true;
            }
        }
        return false;
    }

    public int size () {
        int count = 0;
        for(int i=0;i<tasklist.length;i++){
            if(tasklist[i] != null)
                count++;
        }
        return count;
    }

    public Task getTask (int index) {
        if (index > tasklist.length)
            return null;
        else
            return tasklist[index];
    }

    public ArrayTaskList incoming (int from, int to) {
        ArrayTaskList incoming = new ArrayTaskList();
        for (Task listItem : tasklist) {
            if (listItem != null&&listItem.isActive) {
                if (listItem.isRepeatable) {
                    if (listItem.nextTimeAfter(from)!=-1&&listItem.nextTimeAfter(from)<=to) {
                        incoming.add(listItem);
                    }
                } else {
                    if (listItem.getTime() > from && listItem.getTime() <= to) {
                        incoming.add(listItem);
                    }
                }
            }
        }
        return incoming;
    }
}
