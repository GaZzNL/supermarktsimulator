/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import models.Artikel;

/**
 *
 * @author J
 */
public interface ICountable {
    
        public void setQuantity(int quantity);
        public Artikel getArticle();
        public int getQuantity();
}
