/*******************************************************************************
 * Copyright (c) 2018 Edgeworx, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Saeid Baghbidi
 * Kilton Hopkins
 *  Ashita Nagar
 *******************************************************************************/
package org.eclipse.iofog.microservice;

import java.util.List;

/**
 * represents Microservices
 *
 * @author saeid
 */
public class Microservice {

    private final String microserviceUuid; //container name
    private final String imageName;
    private List<PortMapping> portMappings;
    private String config;
    private String containerId;
    private String registry;
    private String containerIpAddress;
    private boolean rebuild;
    private boolean rootHostAccess;
    private long logSize;
    private List<VolumeMapping> volumeMappings;
    private boolean isUpdating;
    private boolean delete;
    private boolean deleteWithCleanup;

    public Microservice(String microserviceUuid, String imageName) {
        this.microserviceUuid = microserviceUuid;
        this.imageName = imageName;
        containerId = "";
    }

    public boolean isRebuild() {
        return rebuild;
    }

    public void setRebuild(boolean rebuild) {
        this.rebuild = rebuild;
    }

    public String getContainerIpAddress() {
        return containerIpAddress;
    }

    public void setContainerIpAddress(String containerIpAddress) {
        this.containerIpAddress = containerIpAddress;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public List<PortMapping> getPortMappings() {
        return portMappings;
    }

    public void setPortMappings(List<PortMapping> portMappings) {
        this.portMappings = portMappings;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getMicroserviceUuid() {
        return microserviceUuid;
    }

    public String getImageName() {
        return imageName;
    }

    public boolean isRootHostAccess() {
        return rootHostAccess;
    }

    public void setRootHostAccess(boolean rootHostAccess) {
        this.rootHostAccess = rootHostAccess;
    }

    public long getLogSize() {
        return logSize;
    }

    public void setLogSize(long logSize) {
        this.logSize = logSize;
    }

    public List<VolumeMapping> getVolumeMappings() {
        return volumeMappings;
    }

    public void setVolumeMappings(List<VolumeMapping> volumeMappings) {
        this.volumeMappings = volumeMappings;
    }

	public boolean isUpdating() {
		return isUpdating;
	}

	public void setUpdating(boolean updating) {
		isUpdating = updating;
	}

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public boolean isDeleteWithCleanup() {
        return deleteWithCleanup;
    }

    public void setDeleteWithCleanup(boolean deleteWithCleanUp) {
        this.deleteWithCleanup = deleteWithCleanUp;
    }

    @Override
	public boolean equals(Object e) {
        if (this == e) return true;
        if (e == null || getClass() != e.getClass()) return false;
		Microservice microservice = (Microservice) e;
		return this.microserviceUuid.equals(microservice.getMicroserviceUuid());
	}

	@Override
	public int hashCode() {
		return microserviceUuid.hashCode();
	}
}
