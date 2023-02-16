CREATE TABLE user_git_hub (
  id INTEGER NOT NULL,
   login VARCHAR(255),
   node_id VARCHAR(255),
   avatar_url VARCHAR(255),
   gravatar_id VARCHAR(255),
   url VARCHAR(255),
   html_url VARCHAR(255),
   followers_url VARCHAR(255),
   following_url VARCHAR(255),
   gists_url VARCHAR(255),
   starred_url VARCHAR(255),
   subscriptions_url VARCHAR(255),
   organizations_url VARCHAR(255),
   repos_url VARCHAR(255),
   events_url VARCHAR(255),
   received_events_url VARCHAR(255),
   type VARCHAR(255),
   site_admin BOOLEAN NOT NULL,
   name VARCHAR(255),
   company VARCHAR(255),
   blog VARCHAR(255),
   location VARCHAR(255),
   email VARCHAR(255),
   hireable VARCHAR(255),
   bio VARCHAR(255),
   twitter_username VARCHAR(255),
   public_repos INTEGER,
   public_gists INTEGER,
   followers INTEGER,
   following INTEGER,
   created_at TIMESTAMP WITHOUT TIME ZONE,
   updated_at TIMESTAMP WITHOUT TIME ZONE,
   CONSTRAINT pk_usergithub PRIMARY KEY (id)
);