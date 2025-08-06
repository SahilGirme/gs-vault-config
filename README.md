# gs-vault-config
Hashicorp Vault Configuration Project

You’ll start up Vault, store configuration properties inside Vault, build a Spring application and connect it with Vault.
-Java 17 or later
-required a Docker installation in local system and then in hashicorp folder we have hashicorp vault compose.yml run it on cmd **"docker compose -f compose.yaml up"**


-Vault is a secrets management system allowing you to store sensitive data which is encrypted at rest.
You need to access the Vault container to store the data. Connect to the running Docker container with the command:
**"docker exec -it guide-vault sh"
**
-You are now running commands inside of the HashiCorp Vault container.
First, you need to set two environment variables to point the Vault CLI to the Vault endpoint and provide an authentication token.
**export VAULT_TOKEN="00000000-0000-0000-0000-000000000000"
export VAULT_ADDR="http://127.0.0.1:8200"
**
-Now you can store configuration key-value pairs inside Vault. For this guide, you store two key-value pairs:
**vault kv put secret/gs-vault-config example.username=demouser example.password=demopassword
vault kv put secret/gs-vault-config/cloud example.username=clouduser example.password=cloudpassword
**
Now you have written two entries in Vault secret/gs-vault-config and secret/gs-vault-config/cloud.
With the Vault container running and the data loaded, you are now ready to turn your attention to the Spring application.

