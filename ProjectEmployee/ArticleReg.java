package org.lu.ics.labs;

import java.util.ArrayList;
public class ArticleReg {
	
		
		
		private ArrayList<Article> articleReg;
		
		public ArticleReg() {
			setArticleReg(new ArrayList<Article>());
		}
		
		public ArticleReg(ArrayList<Article> articleReg) {
			super();
			this.articleReg = articleReg;
		}
		
		public ArrayList<Article> getArticleReg() {
			return articleReg;
		}
		
		public void setArticleReg(ArrayList<Article> articleReg) {
			this.articleReg = articleReg;
		}
		
		//insert method
		public void insert(Article art) {
			getArticleReg().add(art);
		}
		
		
		//delete method
		public void delete(String id) {
			
			Article tempArticle;
			int i=0;
			boolean find=false;
			while(i<getArticleReg().size() && find==false) {
				
				tempArticle=getArticleReg().get(i);
				
				if(tempArticle.getID().equals(id)){
					getArticleReg().remove(i);
					find=true;
				}
				
				i++;
				
			}
		}
		//find method
			
		public Article find(String id) {
			
			for(int i=0;i<getArticleReg().size();i++) {		
				if(getArticleReg().get(i).getID().equals(id))
					return getArticleReg().get(i);		
			}
			return null;
			
		}
		
	
}
