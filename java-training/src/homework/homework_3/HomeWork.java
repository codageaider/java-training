package homework.homework_3;

import java.util.List;

public class HomeWork {
}

class Song {
    String title;
    int playCount;
    List<String> genre;
}
/*
Suppose you are given a List of songs.
genre = pop, rock,
write a function that returns for each genre the song that is played
the maximum number of times.

song = {"title-1", 5 , ["pop","rock"]}, {"title-2",6,["pop"]}, {"title-3",4,["rock"]}
output: 
pop -> title-2,6
rock -> title-1, 5
 */