package models;

import java.util.ArrayList;
import java.util.List;

public class WinkelMand {

	private List<Artikel> artikellen;
        
        public WinkelMand(){
            this.artikellen = new ArrayList<Artikel>();
        }
        
        public void addArticle(Artikel article){
            this.artikellen.add(article);
        }
        
        public void removeArticle(int id){
            this.artikellen.remove(id);
        }
        
        public Artikel getArticle(int id){
            return this.artikellen.get(id);
        }
        
        public List<Artikel> getArticle(){
            return this.artikellen;
        }

}
