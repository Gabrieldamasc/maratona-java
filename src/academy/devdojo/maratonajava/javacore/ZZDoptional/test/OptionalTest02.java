package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaOptional = MangaRepository.findByTitle("Pokemom");
        mangaOptional.ifPresent(manga -> manga.setTitle("Pokemão 2"));
        System.out.println(mangaOptional);

        Manga manga = MangaRepository.findByID(1)
                .orElseThrow(IllegalArgumentException::new);

        Manga manga1 = MangaRepository.findByTitle("Full Metal")
                .orElse(new Manga(3, "Full Metal", 21));
        System.out.println(manga1);
    }
}
