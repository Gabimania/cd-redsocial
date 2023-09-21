package com.campusdual.javaExercises.season6;

import com.campusdual.Utils;
import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SocialNetwork {
    //Attribute
    private List<User> myList = new ArrayList<>();
    private User activeUser;
    private Post uploadPost;
    private List<Post> userPosts = new ArrayList<>();
    private List<Comments> userComments = new ArrayList<>();



    //Getter and setter
    public List<User> getMyList() {
        return myList;
    }
    public void setMyList(List<User> myList) {
        myList = myList;
    }
    public User getActiveUser() {
        return activeUser;
    }
    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }
    public Post getUploadPost() {
        return uploadPost;
    }
    public void setUploadPost(Post uploadPost) {
        this.uploadPost = uploadPost;
    }
    public List<Post> getUserPosts() {
        return userPosts;
    }
    public void setUserPosts(List<Post> userPosts) {
        this.userPosts = userPosts;
    }


    //Method
    public void principalView() {
        int option = 0;
        do {
            System.out.println("Selecciona la opción que quieras:");
            System.out.println("1. Registrarse");
            System.out.println("2. Login");
            System.out.println("0. Salir");
            option = Utils.integer("Selecciona la opción: ");
            switch (option) {
                case 1:
                    this.singIn();
                    break;
                case 2:
                    this.login();
                    break;
                default:
                    break;
            }
        } while (option != 0 );
    }

    public void home() {
        int option = 0;
        do {
            System.out.println("Selecciona la opción que quieras:");
            System.out.println("1. Seguir usuario");
            System.out.println("2. Dejar de seguir usuario");
            System.out.println("3. Publicar un post");
            System.out.println("4. Eliminar un post");
            System.out.println("5. Publicar un comentario");
            System.out.println("6. Mostrar mis últimos posts");
            System.out.println("7. Mostrar el número de comentarios de un post");
            System.out.println("0. Salir");

            option = Utils.integer("Selecciona la opción: ");
            switch (option) {
                case 1:
                    this.follow();
                    break;
                case 2:
                    this.unfollow();
                    break;
                case 3:
                    this.addPost();
                    break;
                case 4:
                    this.removePost();
                    break;
                case 5:
                    this.addComment();
                    break;
                default:
                    break;
            }
        } while (option != 0);
    }

    //Sign in Method
    public void singIn() {
        String name = Utils.string("Escribe el nombre del nuevo usuario: ");
        User user = new User(name);
        this.getMyList().add(user);

    }

    //Log in method
    public void login() {
        String logeUser = Utils.string("Iniciar sesión: "); //Change
        for (User u : this.getMyList()){
            if (u.getUserName().equals(logeUser)){
                this.setActiveUser(u);
                break;
            }
        }
        if (this.getActiveUser() != null){
            this.home();
        }else{
            System.out.println("No existe este usuario.");
        }
    }

    public void follow() {
        String userToFollow = Utils.string("Introduce el usuario que quieres empezar a seguir: ");
        boolean findUser = false;
        for (User u : this.getMyList()) {
            if (u.getUserName().equals(userToFollow)) {
                System.out.println("Has empezado a seguir a " + userToFollow);
                this.getActiveUser().addFriend(u);
                findUser = true;
                break;
            }
        }
        if (!findUser){
            System.out.println("Este usuario no existe");
        }
    }

    public void unfollow(){
        String userToUnfollow = Utils.string("Introduce el usuario que quieres dejar de seguir: ");
        boolean findUser = false;
        for (User u : this.getMyList()) {
            if (u.getUserName().equals(userToUnfollow)) {
                System.out.println("Has dejado de seguir a " + userToUnfollow);
                this.getActiveUser().removeFriend(u);
                findUser = true;
                break;
            }
        }
        if (!findUser) {
            System.out.println("El usuario no existe");
        }
    }

    public void showCommentNumber() {

    }

    public void addPost() {
        System.out.println("Selecciona una opción: ");
        System.out.println("1. Subir un texto");
        System.out.println("2. Subir una imagen");
        System.out.println("3. Subir un vídeo");
        int post = Utils.integer("Selecciona el tipo de post que deseas subir: ");
        if (post == 1) {
            String title = Utils.string("Introduce un título para tu texto: ");
            String content = Utils.string("Introduce un contenido para tu texto: ");
            Date date = new Date();
            Post t = new Text(date, title, content);
            this.getUserPosts().add(t);
            System.out.println("Has subido tu texto con ID " + t.getID() + " correctamente.");
        } else if (post == 2) {
            String title = Utils.string("Introduce un título para tu imagen: ");
            String dimension = Utils.string("Introduce las dimensiones de tu imagen: ");
            Date date = new Date();
            Post i = new Image(date, title, dimension);
            this.getUserPosts().add(i);
            System.out.println("Has subido tu texto con ID " + i.getID() + " correctamente.");
        } else if (post == 3) {
            String title = Utils.string("Introduce un título para tu vídeo: ");
            String videoQuality = Utils.string("Introduce las calidad de tu vídeo: ");
            String duration = Utils.string("Introduce la duración de tu vídeo: ");
            Date date = new Date();
            Post v = new Video(date, title, videoQuality, duration);
            this.getUserPosts().add(v);
            System.out.println("Has subido tu texto con ID " + v.getID() + " correctamente.");
        } else {
            System.out.println("El número introducido no es válido");
        }
    }

    public void removePost() {
        System.out.println("Estos son los ID de tus post: ");
        for (Post i:this.getUserPosts()) {
            System.out.println(i.getID());
        }
        String delete = Utils.string("Escribe el ID del post que deseas eliminar: ");
        for (Post d : this.getUserPosts()) {
            if (d.getID().equals(delete)) {
                getUserPosts().remove(d); // Eliminar el post si el título coincide
                System.out.println("El post ha sido eliminado correctamente");
                break;
            } else {
                System.out.println("El post no existe. Introduce un valor válido");
            }
        }
    }

    public void addComment() {
        String comment = Utils.string("Escribe el comentario que desees: ");
        String text = Utils.string("Escribe el comentario de texto que deseas dejar: ");
        Date date = new Date();
    }
}