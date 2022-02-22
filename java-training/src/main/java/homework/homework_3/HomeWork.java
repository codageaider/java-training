package homework.homework_3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HomeWork {
    public static void main(String[] args) {

    }
    // Problem:
// genreMaxPlayedSong(List<Song> songs, int k) -> it returns
    // for each genre the top k played songs

    // genre -> song that was played the maximum number of times
    // genre-1 -> song
    // genre-2 -> song
    // genre-3 -> song
    // key, value   HashMap -> key is genre and in the value you can store song.
    // key will alwasy store the song that is played the most time till now.

    /*
    genre-1 -> title-1, 5
    HashMap<Genre,Song> --> genre, song that is played the max number of times.
    List<Song> listofSongs.
    for each song in listOfSongs
          listOfGenre = getGenreForCurrentSong
          for each genre : listOFGenre
               genre is there in the hashmap
                  we upate the hashmap if the current song is played more times

     */
    public static void genreMaxPlayedSong(List<Song> songs) {
        HashMap<String, Song> map = new HashMap<>();
        for (Song song : songs) {
            List<String> genres = song.getGenre();
            for (String genre : genres) {
                if (map.containsKey(genre)) {
                    Song preSong = map.get(genre);
                    if (preSong.getPlayCount() < song.getPlayCount()) {
                        map.put(genre, song);
                    }
                } else {
                    map.put(genre, song);
                }
            }
        }
        Set<Map.Entry<String, Song>> entries = map.entrySet();
        for (Map.Entry entry : entries) {
            Song song = (Song) entry.getValue();
            System.out.println(entry.getKey() + " -> " + song.getTitle() + "," + song.getPlayCount());
        }
    }
}

class Song {
    String title;
    List<String> genre;
    int playCount;

    public String getTitle() {
        return title;
    }

    public int getPlayCount() {
        return playCount;
    }

    public List<String> getGenre() {
        return genre;
    }

}
/*
Suppose you are given a List of songs.
genre = pop, rock,
write a function that returns for each genre the song that is played
the maximum number of times.

song = {"title-1", 5 , ["pop","rock"]}, {"title-2",6,["pop"]}, {"title-3",4,["rock"]},
{"title-4",4,["pop","rock","classical"]},{"title-5",10,["jazz","pop"],
{"title-6",1,["jazz"]}, {"title-7",6,["jazz"]}
}
output:
pop -> title-2,6
rock -> title-1, 5
}
k=2
Map<String, List<>> function(songList, int k){
output:
pop ->  title-2 , 6 | title-5 , 10
rock -> title-1 ,5 | title-3 , 4
classical -> title-4 , 4
jazz -> title-5 , 10 |title-7,  6


}
 */

/*



 */