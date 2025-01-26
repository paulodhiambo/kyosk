APP_NAME := book-service
NAMESPACE := default
DEPLOYMENT_DIR := deployment

# Kubernetes Commands
KUBECTL := kubectl
MINIKUBE := minikube

# Docker Commands
DOCKER := docker
DOCKER_IMAGE := paulodhiambo/$(APP_NAME)
DOCKER_TAG := latest

# Default Target
.PHONY: all
all: deploy

# Apply Kubernetes manifests to deploy the app
.PHONY: deploy
deploy:
	$(KUBECTL) apply -f $(DEPLOYMENT_DIR)

# Delete the deployment from Minikube
.PHONY: clean
clean:
	$(KUBECTL) delete -f $(DEPLOYMENT_DIR) || true

# Get the URL of the service exposed by Minikube
.PHONY: service-url
service-url:
	$(MINIKUBE) service $(APP_NAME) --url

# Restart the deployment
.PHONY: restart
restart:
	$(KUBECTL) rollout restart deployment/$(APP_NAME)
