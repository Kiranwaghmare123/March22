Day 4: 17-03-2022
======================
Topics:
	-Scheduling Algorithm
	-Inter Process Communication
	
System Call:
------------
-File Related : open(),read(), write(), close(), createfile()etc...
-Device Related : read(),write(), reposition (),..
-Information Related: getPid(), attribute,sleep(), time &date()
-Process Control: load(), Execute(), abort(), fork(),wait()..
-Communication: connect, signal,...

fork():
--------
-create a child process
	-	0 : child
	-	1 : parent
 

CPU Scheduling:
----------------

Non-Preemptive Algorithms:
----------------------------
	-FCFS : First Come First Serve 
	-SJF : shortest Job First
	-LJF : Longest Job First
	-HRRN : Highest Response Ratio Next
	-Multi level Queue
	-Priority 
	
Preemptive Algorithms:
-----------------------
	-SRTF : Shortest Remaining Time First
	-LRTF : Longest REmaining Time First
	-Round Robin
	-Priority based
	
HW:Make a chart.
-------------------
	Preemption
	Complexity
	Process allocation criteria
	Effect on Waiting
	Effect on Turn araound time
	
Multi level Queue:
-------------------

Process Synchronization:
-------------------------
-Mutual Exclusion
-Progress
-Bounded wait
-No assumption for hardware(Artichectural Neutrality)

HW:Read

-Dinining Philosopher Problem
-Producer-Consumer Problem
-Readers-Writers Problem

-Banking Algorithms
