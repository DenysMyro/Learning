package ua.edu.sumdu.j2se.MyroshnychenkoDenys.tasks;

public class Task {

    String taskTitle;
    int taskTime;
    int taskStartTime;
    int taskEndTime;
    int taskTimeInterval;
    boolean isRepeatable;
    boolean isActive;

	/*Constructors*/

    public Task (String title, int time) {
        this.taskTitle = title;
        this.taskTime = time;
        isActive = false;
        isRepeatable = false;
    }

    public Task (String title, int start, int end, int interval) {
        this.taskTitle = title;
        this.taskStartTime = start;
        this.taskEndTime = end;
        this.taskTimeInterval = interval;
        isActive = false;
        isRepeatable = true;

    }
	
	/*Getters&Setters*/

    public String getTitle () { return taskTitle; }

    public void setTitle (String title) { this.taskTitle = title; }

    public boolean isActive () { return isActive; }

    public void setActive (boolean state) { this.isActive = state; }

    public int getTime  () {
        if(isRepeatable) {
            return taskStartTime;
        } else {
            return taskTime;
        }
    }

    public void setTime (int time) {
        taskTime = time;
        isRepeatable = false;
    }

    public int getStartTime () {
        if(isRepeatable) {
            return taskStartTime;
        } else {
            return taskTime;
        }
    }

    public int getEndTime () {
        if(isRepeatable) {
            return taskEndTime;
        } else {
            return taskTime;
        }
    }

    public int getRepeatInterval () {
        if(isRepeatable) {
            return taskTimeInterval;
        } else {
            return 0;
        }
    }


    public void setTime (int start, int end, int interval) {
        taskStartTime = start;
        taskEndTime = end;
        taskTimeInterval = interval;
        isRepeatable = true;
    }

    public boolean isRepeated () {
        return isRepeatable;
    }
    
    public int nextTimeAfter (int current) {
        if (isRepeatable) {
          return taskStartTime += taskTimeInterval;
       }else {
       if (isActive && current<taskTime) {
            return taskTime;
          } else {
          return -1;
          }
        }   
    }
    
}

