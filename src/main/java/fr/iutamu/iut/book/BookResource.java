package fr.iutamu.iut.book;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;

/**
 * Ressource associée aux livres
 * (point d'accès de l'API REST)
 */
@Path("/books")
@ApplicationScoped
public class BookResource {

    /**
     * Service utilisé pour accéder aux données des livres et récupérer/modifier leurs informations
     */
    private BookService service;

    /**
     * Constructeur par défaut
     */
    public BookResource() {
    }

    /**
     * Constructeur permettant d'initialiser le service avec une interface d'accès aux données
     *
     * @param bookRepo objet implémentant l'interface d'accès aux données
     */
    public @Inject BookResource(BookRepositoryInterface bookRepo) {
        this.service = new BookService(bookRepo);
    }
}