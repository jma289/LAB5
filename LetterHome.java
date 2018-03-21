Last login: Mon Mar 19 17:35:06 on ttys000
stevenson-169-233-99-251:~ jma$ ssh jma289@unix.ucsc.edu
jma289@unix.ucsc.edu's password: 
Last login: Mon Mar 19 17:35:34 2018 from eduroam-169-233-238-113.ucsc.edu
===============================================================================
*                                                                             *
*               Welcome to the Learning Technologies Timeshare!               *
*                                                                             *
*  Need help? Have a question? Something isn't working? We're here for you!   *
*  Email us at help@ucsc.edu, call us at 459-HELP (459-4357) or open a        *
*  support ticket at http://itrequest.ucsc.edu                                *
*                                                                             *
*  For those of you that are new to UCSC, welcome aboard! For everyone else,  *
*  welcome back! We hope you had a great summer and are ready for another     *
*  school year here in the beautiful forest. You'll notice pretty much all of *
*  our computer labs have been upgraded in both hardware and software. May    *
*  those upgrades help you on your academic road to success. =) As always,    *
*  please let us know if you see any software issues or have any questions.   *
*  Hope you have a wonderful fall quarter!                                    *
*                                                                             *
===============================================================================
You are currently using 3% (34.5 MiB) of your 1.0 GiB quota.
-bash-4.2$ cd cs12a
-bash-4.2$ cd pa1
-bash-4.2$ ls
Lawn.class  Lawn.java
-bash-4.2$ vi Lawn.java
-bash-4.2$ echo "# PA1" >> README.md
-bash-4.2$ git init
Initialized empty Git repository in /afs/cats.ucsc.edu/users/s/jma289/cs12a/pa1/.git/
-bash-4.2$ git add README.md
-bash-4.2$ git commit -m "first commit"
[master (root-commit) d02eff9] first commit
 Committer: Jia-hui Ma <jma289@unix1.lt.ucsc.edu>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly:

    git config --global user.name "Your Name"
    git config --global user.email you@example.com

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 1 file changed, 1 insertion(+)
 create mode 100644 README.md
-bash-4.2$ git remote add origin https://github.com/jma289/PA1.git
-bash-4.2$ git push -u origin master

(gnome-ssh-askpass:17818): Gtk-WARNING **: cannot open display: 
error: unable to read askpass response from '/usr/libexec/openssh/gnome-ssh-askpass'
Username for 'https://github.com': jma289

(gnome-ssh-askpass:17846): Gtk-WARNING **: cannot open display: 
error: unable to read askpass response from '/usr/libexec/openssh/gnome-ssh-askpass'
Password for 'https://jma289@github.com': 
Counting objects: 3, done.
Writing objects: 100% (3/3), 221 bytes | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/jma289/PA1.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.
-bash-4.2$ ls
Lawn.class  Lawn.java  README.md
-bash-4.2$ vi README.md
-bash-4.2$ rm README.md
-bash-4.2$ ls
Lawn.class  Lawn.java
-bash-4.2$ vi Lawn.java
-bash-4.2$ vi Lawn.java
-bash-4.2$ ls
Lawn.class  Lawn.java
-bash-4.2$ cd -
/afs/cats.ucsc.edu/users/s/jma289/cs12a
-bash-4.2$ ls
file1  file3  lab1  lab3  lab5  lab7    pa1  pa3  pa5  Place.class  PlaceTest.class  Problem3.class  Problem4.class
file2  file4  lab2  lab4  lab6  myFile  pa2  pa4  pa6  Place.java   PlaceTest.java   Problem3.java   Problem4.java
-bash-4.2$ rm file1 file2 file3 file4 Place.java Place.class PlaceTest.class PlaceTest.java Problem3.class Problem3.java Problem4.class Problem4.java
-bash-4.2$ ls
lab1  lab2  lab3  lab4  lab5  lab6  lab7  myFile  pa1  pa2  pa3  pa4  pa5  pa6
-bash-4.2$ rm myFile
-bash-4.2$ ls
lab1  lab2  lab3  lab4  lab5  lab6  lab7  pa1  pa2  pa3  pa4  pa5  pa6
-bash-4.2$ ls
lab1  lab2  lab3  lab4  lab5  lab6  lab7  pa1  pa2  pa3  pa4  pa5  pa6
-bash-4.2$ cd pa2
-bash-4.2$ ls
Guess.class  Guess.java
-bash-4.2$ vi Guess.java
-bash-4.2$ cd -
/afs/cats.ucsc.edu/users/s/jma289/cs12a
-bash-4.2$ cd pa3
-bash-4.2$ ls
GCD.class  GCD.java
-bash-4.2$ vi GCD.java
-bash-4.2$ cd -
/afs/cats.ucsc.edu/users/s/jma289/cs12a
-bash-4.2$ vi lab1
-bash-4.2$ cd lab1
-bash-4.2$ ls
HelloWorld2.java  HelloWorld.java
-bash-4.2$ vi HelloWorld.java
-bash-4.2$ vi HelloWorld2.java
-bash-4.2$ cd -
/afs/cats.ucsc.edu/users/s/jma289/cs12a
-bash-4.2$ l
bash: l: command not found...
-bash-4.2$ ls
lab1  lab2  lab3  lab4  lab5  lab6  lab7  pa1  pa2  pa3  pa4  pa5  pa6
-bash-4.2$ cd lab2
-bash-4.2$ ls
HelloWorld.class  private  prog  public  result
-bash-4.2$ vi private
-bash-4.2$ vi prog
-bash-4.2$ vi public
-bash-4.2$ vi result
-bash-4.2$ vi HelloWorld.class
-bash-4.2$ vi result
-bash-4.2$ vi result
-bash-4.2$ cd -
/afs/cats.ucsc.edu/users/s/jma289/cs12a
-bash-4.2$ ls
lab1  lab2  lab3  lab4  lab5  lab6  lab7  pa1  pa2  pa3  pa4  pa5  pa6
-bash-4.2$ cd lab3
-bash-4.2$ ls
Lawn-errs  Lawn-in  Lawn.java  Lawn-out  RunLawn
-bash-4.2$ vi RunLawn
-bash-4.2$ vi Lawn-in
-bash-4.2$ more Lawn-in
100 200
50 75
5
-bash-4.2$ more Lawn-out
The lawn area is 16250.0 square feet.
The mowing time is 0 hours 54 minutes 10 seconds.
-bash-4.2$ cd -
/afs/cats.ucsc.edu/users/s/jma289/cs12a
-bash-4.2$ ls
lab1  lab2  lab3  lab4  lab5  lab6  lab7  pa1  pa2  pa3  pa4  pa5  pa6
-bash-4.2$ cd lab4
-bash-4.2$ ls
GCD  GCD.class  GCD.java  Makefile
-bash-4.2$ vi GCD.java
-bash-4.2$ vi Makefile
-bash-4.2$ ls
GCD  GCD.class  GCD.java  Makefile
-bash-4.2$ cd -
/afs/cats.ucsc.edu/users/s/jma289/cs12a
-bash-4.2$ ls
lab1  lab2  lab3  lab4  lab5  lab6  lab7  pa1  pa2  pa3  pa4  pa5  pa6
-bash-4.2$ cd lab5
-bash-4.2$ ls
letter1.dat  letter2.dat  letter3.dat  LetterHome.class  LetterHome.java
-bash-4.2$ vi LetterHome.java

         }else if( sentenceCode == 5 ){
            if( modifierCode == 1 ){
               phrase = "cookies";
            }else if( modifierCode == 2 ){
               phrase = "stuff";
            }else if( modifierCode == 3 ){
               phrase = "money";
            }else{
               phrase = "ERROR";
            }
            System.out.println("Thanks for the " + phrase + " you sent.");
         }
      }
   }


   // weatherModifier()
   // returns the correct word for a weather sentence
   static String weatherModifier(int m) {
      String word=null;

      // select weather modifier
      if(m == 1)
         word = "great";
      if(m == 2)
         word = "foggy";
      if(m == 3)
         word = "hot";
      if(m == 4)
         word = "cold";
      if(m == 5)
         word = "variable";
      if( m<1 || m>5)
         word = "ERROR";

      return word;
   }

}
