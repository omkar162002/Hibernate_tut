package Hibernate_tut.com.relationship;
// help
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Question {
	@Id
	private int qestionId;
	private String que;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Answer> ans;

	public int getQestionId() {
		return qestionId;
	}

	public void setQestionId(int qestionId) {
		this.qestionId = qestionId;
	}

	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	public Question(int qestionId, String que, List<Answer> ans) {
		super();
		this.qestionId = qestionId;
		this.que = que;
		this.ans = ans;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Question [qestionId=" + qestionId + ", que=" + que + ", ans=" + ans + "]";
	}
	
	


	

}
