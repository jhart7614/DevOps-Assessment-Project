# -*- mode: ruby -*-
# vi: set ft=ruby :


Vagrant.configure("2") do |config|
	config.vm.box = "chad-thompson/ubuntu-trusty64-gui"
  
	 config.vm.provider "virtualbox" do |vb|
		vb.gui=false
		vb.memory ="2048"
		vb.cpus=1
	end

	config.vm.define "Mac1" do |machine1|
		machine1.vm.hostname = "Mac1.gac.local"
		machine1.vm.network "public_network", ip: "192.168.1.30"
		machine1.vm.synced_folder "shared1", "/tmp/shared1"
		machine1.vm.provision "shell", path: "JavaGitInstall.sh"
	end
	
	config.vm.define "Mac2" do |machine2|
		machine2.vm.hostname = "Mac2.gac.local"
		machine2.vm.network "public_network", ip: "192.168.1.130"
		machine2.vm.synced_folder "shared2", "/tmp/shared2"
		machine2.vm.provision "shell", path: "JavaGitMavenInstall.sh"
	end
end