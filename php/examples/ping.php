<?php
/**
 * Example code to send Rosette API a ping to check its reachability
 **/

require_once("vendor/autoload.php");    // assuming composer.json is properly configured with Rosette API
use rosette\api\Api;
use rosette\api\RosetteException;

$options = getopt(null, array("key:", "url::"));
if (!isset($options["key"])) {
    echo "Usage: php " . __FILE__ . " --key <api_key> --url=<alternate_url>\n";
    exit();
}

$api = isset($options["url"]) ? new Api($options["key"], $options["url"]) : new Api($options["key"]);
$api->setVersionChecked(true);

try {
    $result = $api->ping();
    var_dump($result);
} catch (RosetteException $e) {
    error_log($e);
}
