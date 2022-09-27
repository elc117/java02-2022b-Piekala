class testAnime{

  int main(){
    Anime anime1 = new Anime();
    Anime anime2 = new Anime("Boku no hero", true, 0);
    
    anime1.setNome("Neon Genesis Evangelion");
    anime1.setDiasAtuais(false);
    anime1.setAno(1995);
    
    anime2.estaAtivoHoje();
    anime2.setAno(2016);
    system.out.println(anime2.anosDesdeCriacao());
  }

}
