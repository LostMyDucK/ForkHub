package com.github.mobile;

import android.content.Intent;

import com.github.mobile.Intents;
import com.github.mobile.api.model.Project;
import com.github.mobile.api.model.Team;

import org.eclipse.egit.github.core.Gist;
import org.eclipse.egit.github.core.GistFile;
import org.eclipse.egit.github.core.Issue;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.User;

import java.io.Serializable;

import static org.eclipse.egit.github.core.RepositoryId.createFromUrl;

/**
 * Created by shalini on 2/13/2017.
 */

public interface BuilderInterface {
    public Intents.Builder repo(RepositoryId repositoryId);

    /**
     * Add repository to intent being built up
     *
     * @param repository
     * @return this builder
     */
    public Intents.Builder repo(Repository repository) ;

    /**
     * Add issue to intent being built up
     *
     * @param issue
     * @return this builder
     */
    public Intents.Builder issue(Issue issue);

    /**
     * Add project to intent being built up
     *
     * @param project
     * @return this builder
     */
    public Intents.Builder project(Project project);

    /**
     * Add gist to intent being built up
     *
     * @param gist
     * @return this builder
     */
    public Intents.Builder gist(Gist gist);

    /**
     * Add gist id to intent being built up
     *
     * @param gist
     * @return this builder
     */
    public Intents.Builder gist(String gist);

    /**
     * Add gist file to intent being built up
     *
     * @param file
     * @return this builder
     */
    public Intents.Builder gistFile(GistFile file);

    /**
     * Add user to intent being built up
     *
     * @param user
     * @return this builder;
     */
    public Intents.Builder user(User user);

    /**
     * Add team to intent being built up
     *
     * @param team
     * @return this builder;
     */
    public Intents.Builder team(Team team);

    /**
     * Add extra field data value to intent being built up
     *
     * @param fieldName
     * @param value
     * @return this builder
     */
    public Intents.Builder add(String fieldName, String value);

    /**
     * Add extra field data values to intent being built up
     *
     * @param fieldName
     * @param values
     * @return this builder
     */
    public Intents.Builder add(String fieldName, CharSequence[] values);
    /**
     * Add extra field data value to intent being built up
     *
     * @param fieldName
     * @param value
     * @return this builder
     */
    public Intents.Builder add(String fieldName, int value);

    /**
     * Add extra field data value to intent being built up
     *
     * @param fieldName
     * @param values
     * @return this builder
     */
    public Intents.Builder add(String fieldName, int[] values);

    /**
     * Add extra field data value to intent being built up
     *
     * @param fieldName
     * @param values
     * @return this builder
     */
    public Intents.Builder add(String fieldName, boolean[] values);

    /**
     * Add extra field data value to intent being built up
     *
     * @param fieldName
     * @param value
     * @return this builder
     */
    public Intents.Builder add(String fieldName, Serializable value);

    /**
     * Get built intent
     *
     * @return intent
     */
    public Intent toIntent();
}
