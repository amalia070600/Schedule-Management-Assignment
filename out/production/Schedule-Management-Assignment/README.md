# Schedule Management System 

A simple Java (console-based) program to manage course schedule.
This program will allows user to add, view, and edit schedule while automatically checking for conflicts time slot

<h2>Features</h2>
<ul>
<li>Add new schedules with course name, day, start time, and end time</li>
<li>Automatically detect schedule conflicts on the same day</li>
<li>View all existing schedules</li>
<li>Edit or update an existing schedule</li>
<li>Input validation</li>
</ul>

<h2>Class Structure</h2>
<ul>
<li><h4>MainApp</h4></li>
<p>Main class that handles the user interface, input, and menu logic</p>
<li><h4>Schedule</h4></li>
<p>Represents a schedule object with details like course name, day, and time</p>
<li><h4>ScheduleInfo</h4></li>
<p>Temporary object for collecting schedule data before adding it</p>
<li><h4>TimeUtils</h4></li>
<p>Utility class for time parsing and validation</p>
</ul>

<h2>Program Flow</h2>
<h3>1. Program starts and displays the main menu:</h3>
<ul>
<li>Add schedule</li>
<li>View all schedule</li>
<li>Edit schedule</li>
<li>Exit</li>
</ul>

<h3>2. When adding a new schedule:</h3>
<ul>
<li>User inputs course name, day, and start/end times</li>
<li>Program checks for time conflicts</li>
<li>If no conflicts, schedule is added to the list</li>
</ul>

<h3>3. When editing:</h3>
<ul>
<li>User selects which schedule to edit</li>
<li>Updates course name, day, and times</li>
</ul>

<h2>How To Run</h2>
<ul>
<li>Clone this repository: https://github.com/amalia070600/Schedule-Management-Assignment.git</li>
<li>Open the project in IntelliJ IDEA or any Java IDE</li>
<li>Run MainApp.java</li>
</ul>


<p>Amalia Sanyoto || Informatics Engineering - University of Muhammadiyah Malang</p>
