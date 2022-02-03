package com.mph.dao;
import java.util.List;
import com.mph.model.Jobseeker;
public interface JobseekerDao {
    Jobseeker getJobseeker(String username);
    List<Jobseeker> updateJobseeker(Jobseeker js);
    List<Jobseeker> deleteJobseeker(int jsid);
    List<Jobseeker> getAllJobseeker();
    void addJobseeker(Jobseeker js);
	List<Jobseeker> getJobseeker();
}
