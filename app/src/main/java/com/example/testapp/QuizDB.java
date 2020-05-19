package com.example.testapp;

import android.util.Log;

import java.util.Arrays;
import java.util.Random;

public class QuizDB {
    public static String[][] HARDLEVEL = {
        {"IC chips used in computers are usually made of:","Lead","Silicon","Chromium","Gold","2"},
        {"One kilobyte is equal to:","1000 bytes","100 bytes","1024 bytes","1023 bytes","3"},
        {"Which of the following is not an example of Operating System?","Windows 98","BSD Unix","Microsoft Office XP","Red Hat Linux","3"},
        {"Which supercomputer is developed by the Indian Scientists?","Param","Super 301","Compaq Presario","CRAY YMP","1"},
        {"One Gigabyte is approximately equal is:","1000,000 bytes","1000,000,000 bytes","1000,000,000,000 bytes","None of these","2"},
        {"Find out the odd one:","Internet","Linux","Unix","Windows","1"},
        {"What kind of errors can be pointed out by the compiler?","Syntax error","Symantic error","Logical error","Internal error","1"},
        {"What is the control unit's function in the CPU?","To transfer data to primary storage.","To store program instructions.","To perform logic functions.","To decode program instructions.","3"},
        {"What is the best way to have a data and the slide number appear on every slide?","chooses Tools, Header and Footer, click Slide tab, select the desired options, and click Apply to All.","chooses Insert, Header and Footer, click Slide tab, select the desired options, and click Apply to All.","chooses View, Header and Footer, click Slide tab, select the desired options, and click Apply to All.","chooses File, Header and Footer, click Slide tab, select the desired options, and click Apply to All.","2"},
        {"What do you use to create a chart?","Pie Wizard","Excel Wizard","Data Wizard","Chart Wizard","4"},
        {"Which is the part of the computer system that one can physically touch?","data","operating systems"," hardware","software","3"},
        {"IC chips used in computers are usually made of:","Lead","Silicon","Chromium","Gold","2"},
        {"Which of the following is not an example of an Operating System?","Windows 98","BSD Unix","Microsoft Office XP","Red Hat Linux","3"},
        {"One Gigabyte is approximately equal is:","1000,000 bytes","1000,000,000 bytes","1000,000,000,000 bytes","None of these","2"},
        {"Compact discs, (according to the original CD specifications) hold how many minutes of music?","74 mins","90 mins","56 mins","60 mins","1"},
        {"Which of the following is not an input device?","Mouse","Light pen","Keyboard","VDU","4"},
        {"What type of process creates a smaller file that is faster to transfer over the internet?","Compression","Fragmentation","Encapsulation","None of the above","1"},
        {"Which of the following is used to Manage Data Base?","Operating System","Compiler","DBMS","None of the above","3"},
        {"Which of the following is an example of non-volatile memory?","Cache memory","RAM","ROM","None of the above","3"},
        {"File extensions are used in order to ……….","Name the file","Ensure the filename is not lost","Identify the file","Identify the file type","4"},
        {"There are …………. parts to a computer system.","2","4","16","100","2"},
        {"During the ………… portion of the Information Processing Cycle, the computer acquires data from some source.","processing","storage","input","output","3"},
        {"Which one of the following is different from other members?","Google","Windows","Linux ","Mac","1"},
        {"The hexadecimal number system consists of the symbols-","0 – 7","0 – 9 , A – F","0 – 7, A – F","None of these","2"},
        {"1 GB is equal to-","230 bits","230 bytes","220 bits","220 bytes","2"},
        {"A microprocessor unit, a memory unit, and an input/output unit form a:","CPU","compiler","microcomputer","ALU","3"},
        {"Process to exit from computer by giving correct instructions such as 'EXIT' is classified as-","log in","process out","process in","log out","4"},
        {"Function of running and loading programs by use of peripherals is function of?","operating system","inquiry system","dump programs","function system","1"},
        {"An assembler is-","Programming language dependent.","Syntax dependant.","Machine dependant.","Data dependant.","3"},
        {"Which amongst the following is not an advantage of Distributed systems?","Reliability","Incremental growth","Resource sharing","None of the above","1"},
        {"The term ‘page traffic’ describes","Number of pages in memory at a given instant.","Number of papers required to be brought in at a given page request.","The movement of pages in and out of memory.","Number of pages of executing programs loaded in memory.","3"},
        {"What is an Assembler?","A program that places programs into memory an prepares them for execution","Is a program that appears to execute a source program as if it were machine language","A program that automates the translation of assembly language into machine language","A program that accepts a program written in high-level language and produces an object program","3"},
        {"An interpreter is-","A program that places programs into memory an prepares them for execution","A program that appears to execute a source program as if it were machine language","A program that automates the translation of assembly language into machine language","A program that accepts a program written in high-level language and produces an object program","2"},
        {"How many buses are connected as part of the 8085 microprocessor?","2","3","5","8","2"},
        {"How many bits are used in the data bus?","7","8","9","16","2"},
        {"What would you do to highlight a word? You position the cursor next to the word, and then","Drag mouse while holding button down","Click mouse once","Roll and then click mouse","None of these","1"},
        {"Reusable optical storage will typically have the acronym ……...","CD","DVD","ROM","RW","2"},
        {".……………. is processed by the computer into information.","Data","Numbers","Alphabets","Pictures","1"},
        {"Which supercomputer is developed by the Indian Scientists?","Param","Super 301","Compaq Presario","CRAY YMP","1"},
        {"In binary code, the number 7 is written as -","110","111","101","100","2"},
        {"In which generation of computers, transistors were used?","First","Second","Third","Fourth","2"},
        {"The term 'Pentium' is related to -","DVD","Hard Disk","Microprocessor","Mouse","3"},
        {"Which of the following is the most powerful type of computer?","Super-micro","Super Computer","Micro Computer","Mini Computer","2"},
        {"The most common type of storage devices are ………….","persistent","optical","magnetic","flash","3"},
        {"The ………… tells the computer how to use its components.","utility","network","operating system","motherboard","3"},
        {"Which one of the following is not a linear data structure?","Array ","Binary Tree","Queue","Stack","2"},
        {"The set of computer programs that manage the hardware/software of a computer is called.","Compiler system","Operation system","Operating system","None of these","3"},
        {"Which of the following is true?","Block cipher technique is an encryption technique.","Steam cipher technique is an encryption technique.","Both (1) and (2).","Neither of (1) and (2).","3"},

        {"Computer tools such as Word, Excel and Power Point are products owned by which of these companies?","Intel","Apple","Microsoft","Google","3"},
        {"Computers which offer information are called .......... and those which seek information are called -","Servers, clients","Clients, servers","Applications, complex soft-wares","System software, application software","1"},
    };

    public static String[][] MEDIUMLEVEL = {
        {"Computer tools such as Word, Excel and Power Point are products owned by which of these companies?","Intel","Apple","Microsoft","Google","3"},
        {"Computers which offer information are called .......... and those which seek information are called -","Servers, clients","Clients, servers","Applications, complex soft-wares","System software, application software","1"},
        {"Email addresses in ............ field are visible to all recipients. Email addresses in .......... field are visible to only the recipient.","Cc and Bcc, To","To and Bcp, Cc","To and Cc, Bcc","Bcc, To","3"},
        {"FAQ stands for -"," Frequently Asked Questions","Favourite Asked Questions","Favourite and Answered Questions","Frequently Answered Questions","1"},
        {"The top most row of keys on the standard keyboard contains .......... keys, and the longest key on the keyboard is -","alphabetic, space bar","number, enter key","function, enter key","function, space bar","4"},
        {"Choose the best option : An anti virus program is designed to ........... computer virus.","identify and eliminate","scan device and identify","scan device, identify and eliminate","scan device and eliminate","3"},
        {"Speed of internet connection is measured in ............","GHz","dpi","ppm","Gbps","4"},
        {"Which of the following is not a type of printer?","Inkjet","3-d","Landscape","Laserjet","3"},
        {"Hitting ....... key and ...... will open a dialogue box for searching a world in pdf file.","Alt, S","Ctrl, F","Ctrl, S","Alt, F","2"},
        {"A/ An ......... is a computer program that spreads by inserting copies of itself into other executable code or documents.","Operating System","Computer Virus","Firewall","Anti-virus","2"},
        {"Which web browser was the first web browser from the following?","Mosaic","Opera","Safari","MSIE","1"},
        {"Every web page that is displayed on the internet has a specific address associated with it. This address is known as -","Uniform Research Limited","Uniform Resource Locator","Uniline Resource Lab","Uniform Research Locator","2"},
        {"Which of the following is a chat engine?","Google Bol","Yahoo Talk","Rediff Messenger","None of these","4"},
        {"At the time of composing any e-mail, we have three options - To, CC and BCC. What is the meaning of BCC here?","Blind carbon copy","Blind copy carbon","Blind compose copy","Blind copy compose","1"},
        {"At the time of downloading from the internet, some files may be in compressed form having extension -",".zip",".tar",".rar","All of these","4"},
        {"Video conferencing is done through -","Telephone Network","IP Network","TV","None of these","2"},
        {"Which of the following technologies provide high speed data communication over wireless network?","Wireless LAN","Wifi","Wimax","All of these","4"},
        {"Learning online through internet is also known as -","E-teaching","Chatting","E-learning","Video Conferencing","3"},
        {"Which of the following is a telecommunication device?","Telephone","Telegraph","Computer with Internet","All of these","4"},
        {"Which of the following is a video compression technology?","MPEG","NPEG","LPEG","OPEG","1"},
        {"Which of the following is internet service provider in India?","VSNL","BSNL","Airtel","All of these","4"},
        {"Which of the following is not a search engine?","www.google.com","www.webopedia.com","www.highereducationmp.org","www.yahoo.com","3"},
        {"Which was the World's first successful electronic computer?","PARAM","CRAY-1","PASCALINE","ENIAC","4"},
        {"Windows is an example of which of the following ?","Operating System","Hardware","Active Desktop","None of the above","1"},
        {"Which of the following is an Application Software ?","Compiler","Operating System","MS-Office","None of the above","3"},
        {"Which of the following is an input device?","Plotter","Printer","Monitor","Scanner","4"},
        {"The software, which allows you to view the webpage, is called -","Website","Web Browser","Interpreter","Operating System","2"},
        {"Which of the following is not an output device?","Plotter","Printer","Monitor","Scanner","4"},
        {"In fiber-optics, the signal source is -","Light waves","Sound waves","a-rays","Cosmic rays","1"},
        {"Who is the inventor of www?","Bill Gates","Tim Berners-Lee","Timothy Bil","Ray Tomlinson","2"},
        {"The service of the Internet that provides audio and video conversation, is called -","chat","e-mail","video conferencing","video chat","3"},
        {"In the context of computer security, crackers are also known as -","black hat hackers","white hat hackers","elite hackers","script kiddie","1"},
        {"Ethernet is an example of -","MAN","LAN","WAN","Wi-Fi","2"},
        {"Weibo is a social media platform popularly used in -","South Korea","China","Thailand","Japan","2"},
        {"Mobikwik is the name of a -","Mobile wallet and online payment system","White Label ATM entity","Brown Label ATM entity","Online shopping portal","1"},
        {"Which of the following is an Operating system?","UNIX","JAVA","ORACLE","MS-Office","1"},
        {"Which of the following is an extremely fast, small memory between CPU and main memory?","Main RAM and ROM","Cache memory","Secondary memory","None of the above","2"},
        {"Television transmission is an example of which of the following?","Simplex Communication","Half-duplex Communication","Full-duplex Communication","None of the above","1"},
        {"A device that converts from decimal to binary numbered is called -","encoder","decoder","CPU","converter","1"},
        {"What is the decimal value of the hexadecimal number 777?","1911","19","191","19111","1"},
        {"How many truth table entries are necessary for a four-input circuit?","16","12","4","8","1"},
        {"The internet protocol address of each computer is -","Unique","Same","Continuous","Structured","1"},
        {"Which of the following is not an example of storage device?","C.D.","D.V.D.","Loop pattern","Hard disk","3"},
        {"What is Norton?","Antivirus","Vaccine","Program","Network","1"},
        {"How internet banking can be accessed through?","Mobile with internet facility","Laptop with internet facility","Computer with internet facility","All of these","4"},
        {"Which of the following is not an input device?","Microphone","Keyboard","Mozilla firebox","Mouse","3"},
        {"Web client is called -","Web server","Web browser","Both (Web server) and (Web browser)","None of the above","2"},
        {"http:// www.examination.com is the example of -","URL","HTML","AML","LAN","1"},
        {"Which of the following enables us to send the same letter to different person in MS Word?","MMail join","Mail copy","Mail insert","Mail merge","4"},
        {"Which of the following is not a fundamental process state?","Ready","Terminated","Executing","Blocked","4"},
    };

    public static String[][] EASYLEVEL = {
        {"A ………. is an electronic device that process data, converting it into information.", "computer", "processor", "case", "stylus", "1"},
        {"The first mechanical computer designed by Charles Babbage was called ?", "Abacus", "Analytical Engine", "Calculator", "Processor", "2"},
        {"Which of the following is the most powerful type of computer ?", "Super–micro", "Super conductor", "Super computer", "Megaframe", "3"},
        {"One kilobyte is equal to:","1000 bytes","100 bytes","1024 bytes","1023 bytes","3"},
        {"A ………. is an electronic device that process data, converting it into information.","computer","processor","case","stylus","1"},
        {"bit stands for","binary information term","binary digit","binary tree","Bivariate Theory","2"},
        {"The first mechanical computer designed by Charles Babbage was called ?","Abacus","Analytical Engine"," Calculator","Processor","2"},
        {"Which of the following is the most powerful type of computer ?"," Super–micro","Super conductor","Super computer"," Megaframe","3"},
        {" Which is a single integrated circuit?"," Gate"," Mother Board","Chip"," CPU","1"},
        {"C is ?"," A third generation high level language"," A machine language"," An assembly language","All of the above","1"},
        {" Web pages are written using ?"," FTP "," HTTP "," HTML "," URL","3"},
        {"UNIVAC is an example of.","First generation computer"," Second generation computer","Third generation computer","Fourth generation computer","1"},
        {"Which of the following is an example of non volatile memory ?","VLSI"," LSI ","ROM ","RAM","3"},
        {"Graphic interfaces were first used in a xerox product is called ?","Ethernet","Inter LISP","Small talk","Zeta LISP","1"},
        {"Find the odd one out ?","ORACLE ","SYBASE","C"," INFORMIX","3"},
        {"The ------ is the administrative section of the computer system?","Memory Unit"," Input Unit","Central Processing Unit","Control Unit","3"},
        {"CD–ROM is a kind of?","Optical disk","Magnetic disk","Magneto–Optical disk","None of these","2"},
        {"What is the full form of lP ?","Interface program"," Interface protocol"," Internet program","Internet protocol","4"},
        {"A device that converts digital signals to analog signals is ?"," A packet","A modem","A block ","Both (1) and (2)","2"},
        {"The first movie released in 1982 with terrific computer animation and graphics was ?","Star wars","Tron","Forbidden planet","Dark star","1"},
        {"One byte is equivalent to ?"," 4 bits","8 bits","12 bits","32 bits","2"},
        {" What is the primary requisite of a good computer programmer?","Mathematical mind ","Artistic mind","Logical mind","Scientific knowledge","3"},
        {"Find the odd man out.","FTP","POP","SAP","TCP","2"},
        {"Find the odd one out ?","Mouse"," Keyboard","Printer","Touch screen","3"},
        {"Web pages are written using ?","FTP","UML","HTML","URL","3"},
        {"The parity bit is added for the purpose of ?","Coding","Error detection","Controlling","Indexing","2"},
        {"India’s first super computer is ?","Agni","Flow solver","Param","Trisul","3"},
        {"Which of the following is NOT operating system ?","Dos","Unix","Window NT","Java","4"},
        {"Which command combines the contents of one file with another?","RESTORE","RENAME","APPEND","ADD","3"},
        {"ISDN stands for ?","International Standard Digital Network","International Subscriber Dialing Network","Integrated Service Digital Network","Integrated System Digital Network","3"},
        {"'ALU' stands for?","Arithmetic Long Unit","All Longer Units","Around Logical Units","Arithmetic and Logical Units","4"},

        {"Computer tools such as Word, Excel and Power Point are products owned by which of these companies?","Intel","Apple","Microsoft","Google","3"},
        {"Computers which offer information are called .......... and those which seek information are called -","Servers, clients","Clients, servers","Applications, complex soft-wares","System software, application software","1"},
        {"Email addresses in ............ field are visible to all recipients. Email addresses in .......... field are visible to only the recipient.","Cc and Bcc, To","To and Bcp, Cc","To and Cc, Bcc","Bcc, To","3"},
        {"FAQ stands for -"," Frequently Asked Questions","Favourite Asked Questions","Favourite and Answered Questions","Frequently Answered Questions","1"},
        {"The top most row of keys on the standard keyboard contains .......... keys, and the longest key on the keyboard is -","alphabetic, space bar","number, enter key","function, enter key","function, space bar","4"},
        {"Choose the best option : An anti virus program is designed to ........... computer virus.","identify and eliminate","scan device and identify","scan device, identify and eliminate","scan device and eliminate","3"},
        {"Speed of internet connection is measured in ............","GHz","dpi","ppm","Gbps","4"},
        {"Which of the following is not a type of printer?","Inkjet","3-d","Landscape","Laserjet","3"},
        {"Hitting ....... key and ...... will open a dialogue box for searching a world in pdf file.","Alt, S","Ctrl, F","Ctrl, S","Alt, F","2"},
        {"A/ An ......... is a computer program that spreads by inserting copies of itself into other executable code or documents.","Operating System","Computer Virus","Firewall","Anti-virus","2"},
        {"Which web browser was the first web browser from the following?","Mosaic","Opera","Safari","MSIE","1"},
        {"Every web page that is displayed on the internet has a specific address associated with it. This address is known as -","Uniform Research Limited","Uniform Resource Locator","Uniline Resource Lab","Uniform Research Locator","2"},
        {"Which of the following is a chat engine?","Google Bol","Yahoo Talk","Rediff Messenger","None of these","4"},
        {"At the time of composing any e-mail, we have three options - To, CC and BCC. What is the meaning of BCC here?","Blind carbon copy","Blind copy carbon","Blind compose copy","Blind copy compose","1"},
        {"At the time of downloading from the internet, some files may be in compressed form having extension -",".zip",".tar",".rar","All of these","4"},
        {"Video conferencing is done through -","Telephone Network","IP Network","TV","None of these","2"},
        {"Which of the following technologies provide high speed data communication over wireless network?","Wireless LAN","Wifi","Wimax","All of these","4"},
        {"Learning online through internet is also known as -","E-teaching","Chatting","E-learning","Video Conferencing","3"},
        {"Which of the following is a telecommunication device?","Telephone","Telegraph","Computer with Internet","All of these","4"},
    };


    public static String[][] getQuizQuestion(String quizLevel) {
        String arr[][] = new String[10][6];

        if (quizLevel.equals("easy_mode")) {
            return randomizedArr(EASYLEVEL);
        }
        else if (quizLevel.equals("hard_mode")){
            return randomizedArr(HARDLEVEL);
        }
        else if (quizLevel.equals("medium_mode")) {
            return randomizedArr(MEDIUMLEVEL);
        }
        return arr;
    }

    public static String[][] randomizedArr(String arr[][]) {
        String updatedArr[][] = new String[10][6];
        for(int i = 0; i < 10; i++) {
            int min = i == 0 ? 0 : (i * 5) + 1;
            int max = i == 0 ? 4 : (i + 1) * 5;
            try {
                updatedArr[i] = arr[randomIndex(max, min)];
            }
            catch (Exception err) {
                throw err;
            }
        }
        return updatedArr;
    }


    public static int randomIndex(int max, int min) {
        Random rand = new Random();
        int value = rand.nextInt((max-min) + 1) + min;
        return value;
    }

}


