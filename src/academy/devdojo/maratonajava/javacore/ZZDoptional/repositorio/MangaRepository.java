package academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Pokemom", 25), new Manga(2, "Boku no hero", 55));

    public static Optional<Manga> findByTitle(String title){
        return findBy(manga -> manga.getTitle().equals(title));
    }

    public static Optional<Manga> findByID(Integer id){
        return findBy(manga -> manga.getId().equals(id));
    }



    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}


