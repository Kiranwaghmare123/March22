Day 2: 15-03-2022
======================
Topics:
	-Linux Commands
	-Process Management

File system:



Vi Editor:
--------------

1.vi filename.sh

2. Esc + I (insert)
3. 
4.Add your code in file

5.Esc + :wq

	w: save your file
	q: exit from file
	
5. chmod +x filename.sh
	
	Premission grant

6.Execute: ./filename.sh

or

  Execute: bash filename.sh
  
 
 USer and PErmissions:
 ---------------------
 
 
 
 
 
 
 File Access Right:
 3 types of Access rights:
 -------------------------
 Read (r)
 
 Write (w)
 
 Execute (x)
 
 3 types of access level:
 -------------------------
 User (u): the owner of the file
  
 Group (g): file having "group" attribute
 
 Others (o):for all other user
 
 ![image](https://user-images.githubusercontent.com/72081819/158365146-f70dce50-3b99-40ea-81a6-423d1a94542e.png)

 ---------------------------------------
 Process Management:
 Program:
 -having a long lifetime.
 -static instance of code and data.
 -hard disk, secondary memorycan be used for storage.
 -required resources as memory
 
 Process:
 -instance of computer program that being executed.
 -shorter lifetime.
 -dynamic instance of code and data.
 -RAM memory for storage
 -required resources memory, cpu, Io devices,...
 
 ![image](https://user-images.githubusercontent.com/72081819/158364820-7f480319-c2a7-4ab3-aaa8-884b5e6a942f.png)

 
 Process state:
 -----------------
 1.New: 
	-The proes is being create.
 2.Running: 
	-Instructions to be executed.
 3.Waiting:
	-Waitng for some event to occur.
 4.Ready:
	-Waiting to assigned to a aprocessor.
 5.Terminated:
	-finished execution
	![image](https://user-images.githubusercontent.com/72081819/158365324-d05ac3d1-b7ed-430d-a4f2-9e2ce82ab618.png)

	


 
 Process Control Block:
 -----------------------
 -Process state
 -Program counter
 -CPU  registers
 -CPU Scheduling informotion
 -Memory Management information
 - Accounting information
 -I/O status information
 
 
 
 Process Scheduling:
 --------------------
 The act of determining which process is in 
 the ready state, and should be moved to the running state
 is known as Process Scheduling.
 
 Goal: to keep CPU busy all the time  and 
 to deliver response time for all programs.
 
 ![image](https://user-images.githubusercontent.com/72081819/158365023-dbade61b-e9e9-4104-92a1-1b588724aba2.png)

 1.Pre-emptive Process : having a higher priority process
 2.Non-preemptive process : execute by CPU allocation
 
 Queue:Job Pool
 ---------------
 1. Job queue:set of all process in the system.
 2. Ready  queue:set of all processes in the main memory,
	ready and waiting  to execute.
 3. Deveice queue:set of process, waiting for I/O devices.
 
 Schedular:
 -------------
 
 1.Long Term Scheduler (Job Scheduler)
	-selects which process should be 
	brought into the ready queue
	
 2.Short Term Scheduler (CPU Scheduler)
	-selects which process should be execute next and 
	allocates CPU
 3.Midium Term Scheduler
	-process swapping (swap in and swap out)
