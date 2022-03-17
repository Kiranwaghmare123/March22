Day 4: 17-03-2022
======================
Topics:
	-Scheduling Algorithm
	
	-Inter Process Communication
	
Definitions:
-------------

Arrival Time: Time at which the process arrives in the ready queue.

Completion Time: Time at which process completes its execution.

Burst Time: Time required by a process for CPU execution.

Turn Around Time: Time Difference between completion time and arrival time.

Turn Around Time = Completion Time – Arrival Time


Waiting Time(W.T): Time Difference between turn around time and burst time.

Waiting Time = Turn Around Time – Burst Time
	
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


 
 Practice Problem:
 ------------------
 
Ques .1
-------

Consider the following table of arrival time and burst time for three processes P0, P1 and P2. (GATE-CS-2011)
Process   Arrival time   Burst Time
P0            0 ms          9 ms
P1            1 ms          4 ms
P2            2 ms          9 ms
The pre-emptive shortest job first scheduling algorithm is used. Scheduling is carried out only at arrival or completion of processes. What is the average waiting time for the three processes?
 
 
Ques 2:
-------
An operating system uses the Shortest Remaining Time first (SRTF) process scheduling algorithm. Consider the arrival times and execution times for the following processes:
Process  Execution time  Arrival time
P1             20            0
P2             25            15
P3             10            30
P4             15            45
What is the total waiting time for process P2?


Ques 3:
--------

Three process P1, P2 and P3 arrive at time zero. The total time spent by the process in the system is 10ms, 20ms, and 30ms respectively. They spent first 20% of their execution time in doing I/O and the rest 80% in CPU processing. What is the percentage utilization of CPU using FCFS scheduling algorithm?


Ques 4:
----------

Three process p1, P2 and P3 arrive at time zero. Their total execution time is 10ms, 15ms, and 20ms respectively. They spent first 20% of their execution time in doing I/O, next 60% in CPU processing and the last 20% again doing I/O. For what percentage of time was the CPU free? Use Round robin algorithm with time quantum 5ms.

Ques 5:
--------

A uniprocessor computer system has three processes, which alternate 20ms CPU bursts with 80ms I/O bursts. All the processes were created at nearly the same time. The I/O of all the processes can proceed in parallel. What will be the CPU utilization (over a long period of time) using FCFS and Round Robin (time quantum 10ms) for this system? 

Ques 5:
--------

![image](https://user-images.githubusercontent.com/72081819/158805858-4a3423f0-c374-443f-a085-5414f4d0146b.png)

Consider the longest remaining time first (LRTF) scheduling algorithm. In LRTF ties are broken by giving priority to the process with the lowest process id. Calculate the average waiting time.



