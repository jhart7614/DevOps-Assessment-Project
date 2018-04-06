# -*- mode: ruby -*-
# vi: set ft=ruby :


Vagrant.configure("2") do |config|
	config.vm.box = "chad-thompson/ubuntu-trusty64-gui"
	config.vm.synced_folder "shared", "/tmp/shared"
	config.vm.provision "shell", path: "script.sh"
  
	 config.vm.provider "virtualbox" do |vb|
		vb.gui=true
		vb.memory ="1024"
		vb.cpus=1
	end

	config.vm.define "MasterDG" do |machine1|
		machine1.vm.hostname = "masterMachineDG.gac.local"
		machine1.vm.network "public_network", ip: "192.168.1.30"
	end
	
	config.vm.define "agentDG" do |machine2|
		machine2.vm.hostname = "agentMachineDG.gac.local"
		machine2.vm.network "public_network", ip: "192.168.1.130"
	end
end