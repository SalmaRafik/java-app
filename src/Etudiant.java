
public class Etudiant {

	private String matricule;
	private String nom_prenom;
	private String dateNaissance;
	private String villenatale;
	private String groupesanguin;
	private double fraisScolarite;
	
	private boolean fraisTransport;
	private boolean fraisPhotocopie;
	private boolean fraisLogement;
	private boolean fraisSport;
	
	public Etudiant() {
		super();
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom_prenom() {
		return nom_prenom;
	}

	public void setNom_prenom(String nom_prenom) {
		this.nom_prenom = nom_prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getVillenatale() {
		return villenatale;
	}

	public void setVillenatale(String villenatale) {
		this.villenatale = villenatale;
	}

	public String getGroupesanguin() {
		return groupesanguin;
	}

	public void setGroupesanguin(String groupesanguin) {
		this.groupesanguin = groupesanguin;
	}

	public double getFraisScolarite() {
		return fraisScolarite;
	}

	public void setFraisScolarite(double fraisScolarite) {
		this.fraisScolarite = fraisScolarite;
	}

	public boolean isFraisTransport() {
		return fraisTransport;
	}

	public void setFraisTransport(boolean fraisTransport) {
		this.fraisTransport = fraisTransport;
	}

	public boolean isFraisPhotocopie() {
		return fraisPhotocopie;
	}

	public void setFraisPhotocopie(boolean fraisPhotocopie) {
		this.fraisPhotocopie = fraisPhotocopie;
	}

	public boolean isFraisLogement() {
		return fraisLogement;
	}

	public void setFraisLogement(boolean fraisLogement) {
		this.fraisLogement = fraisLogement;
	}

	public boolean isFraisSport() {
		return fraisSport;
	}

	public void setFraisSport(boolean fraisSport) {
		this.fraisSport = fraisSport;
	}
	
	
}
